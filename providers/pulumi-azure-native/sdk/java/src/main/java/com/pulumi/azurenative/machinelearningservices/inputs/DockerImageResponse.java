// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.DockerImagePlatformResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to represent configuration settings for Docker Build
 * 
 */
public final class DockerImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final DockerImageResponse Empty = new DockerImageResponse();

    /**
     * Image name of a custom base image.
     * &lt;seealso href=&#34;https://docs.microsoft.com/en-us/azure/machine-learning/how-to-deploy-custom-docker-image#use-a-custom-base-image&#34; /&gt;
     * 
     */
    @Import(name="dockerImageUri", required=true)
    private String dockerImageUri;

    public String dockerImageUri() {
        return this.dockerImageUri;
    }

    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is &#39;Image&#39;.
     * 
     */
    @Import(name="dockerSpecificationType", required=true)
    private String dockerSpecificationType;

    public String dockerSpecificationType() {
        return this.dockerSpecificationType;
    }

    /**
     * The platform information of the docker image.
     * 
     */
    @Import(name="platform")
    private @Nullable DockerImagePlatformResponse platform;

    public Optional<DockerImagePlatformResponse> platform() {
        return Optional.ofNullable(this.platform);
    }

    private DockerImageResponse() {}

    private DockerImageResponse(DockerImageResponse $) {
        this.dockerImageUri = $.dockerImageUri;
        this.dockerSpecificationType = $.dockerSpecificationType;
        this.platform = $.platform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DockerImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DockerImageResponse $;

        public Builder() {
            $ = new DockerImageResponse();
        }

        public Builder(DockerImageResponse defaults) {
            $ = new DockerImageResponse(Objects.requireNonNull(defaults));
        }

        public Builder dockerImageUri(String dockerImageUri) {
            $.dockerImageUri = dockerImageUri;
            return this;
        }

        public Builder dockerSpecificationType(String dockerSpecificationType) {
            $.dockerSpecificationType = dockerSpecificationType;
            return this;
        }

        public Builder platform(@Nullable DockerImagePlatformResponse platform) {
            $.platform = platform;
            return this;
        }

        public DockerImageResponse build() {
            $.dockerImageUri = Objects.requireNonNull($.dockerImageUri, "expected parameter 'dockerImageUri' to be non-null");
            $.dockerSpecificationType = Codegen.stringProp("dockerSpecificationType").arg($.dockerSpecificationType).require();
            return $;
        }
    }

}
