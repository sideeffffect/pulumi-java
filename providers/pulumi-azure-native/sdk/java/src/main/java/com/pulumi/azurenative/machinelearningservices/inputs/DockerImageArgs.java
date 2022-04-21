// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.DockerImagePlatformArgs;
import com.pulumi.core.Output;
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
public final class DockerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final DockerImageArgs Empty = new DockerImageArgs();

    /**
     * Image name of a custom base image.
     * &lt;seealso href=&#34;https://docs.microsoft.com/en-us/azure/machine-learning/how-to-deploy-custom-docker-image#use-a-custom-base-image&#34; /&gt;
     * 
     */
    @Import(name="dockerImageUri", required=true)
    private Output<String> dockerImageUri;

    public Output<String> dockerImageUri() {
        return this.dockerImageUri;
    }

    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is &#39;Image&#39;.
     * 
     */
    @Import(name="dockerSpecificationType", required=true)
    private Output<String> dockerSpecificationType;

    public Output<String> dockerSpecificationType() {
        return this.dockerSpecificationType;
    }

    /**
     * The platform information of the docker image.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<DockerImagePlatformArgs> platform;

    public Optional<Output<DockerImagePlatformArgs>> platform() {
        return Optional.ofNullable(this.platform);
    }

    private DockerImageArgs() {}

    private DockerImageArgs(DockerImageArgs $) {
        this.dockerImageUri = $.dockerImageUri;
        this.dockerSpecificationType = $.dockerSpecificationType;
        this.platform = $.platform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DockerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DockerImageArgs $;

        public Builder() {
            $ = new DockerImageArgs();
        }

        public Builder(DockerImageArgs defaults) {
            $ = new DockerImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder dockerImageUri(Output<String> dockerImageUri) {
            $.dockerImageUri = dockerImageUri;
            return this;
        }

        public Builder dockerImageUri(String dockerImageUri) {
            return dockerImageUri(Output.of(dockerImageUri));
        }

        public Builder dockerSpecificationType(Output<String> dockerSpecificationType) {
            $.dockerSpecificationType = dockerSpecificationType;
            return this;
        }

        public Builder dockerSpecificationType(String dockerSpecificationType) {
            return dockerSpecificationType(Output.of(dockerSpecificationType));
        }

        public Builder platform(@Nullable Output<DockerImagePlatformArgs> platform) {
            $.platform = platform;
            return this;
        }

        public Builder platform(DockerImagePlatformArgs platform) {
            return platform(Output.of(platform));
        }

        public DockerImageArgs build() {
            $.dockerImageUri = Objects.requireNonNull($.dockerImageUri, "expected parameter 'dockerImageUri' to be non-null");
            $.dockerSpecificationType = Codegen.stringProp("dockerSpecificationType").output().arg($.dockerSpecificationType).require();
            return $;
        }
    }

}
