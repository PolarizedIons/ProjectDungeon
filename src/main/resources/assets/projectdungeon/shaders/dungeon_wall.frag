#version 150 core

in vec4 vertexColorPass;
in vec2 texCoordPass;

out vec4 fragColor;

uniform sampler2D texImage;

void main(){
    fragColor = vec4(1.0, 0,0,1.0);
}
