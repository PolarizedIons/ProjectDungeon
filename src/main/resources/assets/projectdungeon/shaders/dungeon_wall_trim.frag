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

vec3 backgroundColour = vec3(15 / 255.0, 14 / 255.0, 56 / 255.0);
vec3 plotColour = vec3(71 / 255.0, 68 / 255.0, 212 / 255.0);


float plot (vec2 st, float pct){
    return smoothstep(pct-0.05, pct, st.y) - smoothstep(pct, pct+0.05, st.y);
}

void main(){
    vec2 st = gl_FragCoord.xy / resolution.xy;
    vec4 textureColor = texture(texImage, texCoordPass);

    if (textureColor.rgb == vec3(1, 1, 1)) {
        vec3 pct = vec3(st.x);

        pct.g = st.x + tan(time / 64.0);// + tan(time / 100.0);

        vec3 color = backgroundColour; //textureColor.rgb * vertexColorPass.rgb; // mix(colorA, colorB, pct.r);

        color = mix(color, plotColour, plot(st, pct.g));

        fragColor = vec4(color, 1.0) * vertexColorPass;
    }
    else {
        fragColor = textureColor * vertexColorPass;
    }
}
