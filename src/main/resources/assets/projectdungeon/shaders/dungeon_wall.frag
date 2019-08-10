#version 150 core
#ifdef GL_ES
precision mediump float;
#endif

#define PI 3.14159265359

in vec4 vertexColorPass;
in vec2 texCoordPass;

out vec4 fragColor;

uniform sampler2D texImage;
uniform int time;
uniform vec2 resolution;

vec3 colorA = vec3(1.0, 1.0, 1.0);
vec3 colorB = vec3(0.4, 0.4, 0.4);

float plot (vec2 st, float pct){
    return smoothstep(pct-0.01, pct, st.y) - smoothstep(pct, pct+0.01, st.y);
}

void main(){
    vec2 st = gl_FragCoord.xy / resolution.xy;
    vec4 textureColor = texture(texImage, texCoordPass);

    if (textureColor.rgb == vec3(1, 1, 1)) {
        vec3 pct = vec3(st.x);

        pct.g = smoothstep(0.0,1.000, st.x) + tan(time / 100.0);// + tan(time / 100.0);

        vec3 color = colorB; //textureColor.rgb * vertexColorPass.rgb; // mix(colorA, colorB, pct.r);

        color = mix(color, colorA, plot(st, pct.g));

        fragColor = vec4(color, 1.0) * vertexColorPass;
    }
    else {
        fragColor = textureColor * vertexColorPass;
    }
}
