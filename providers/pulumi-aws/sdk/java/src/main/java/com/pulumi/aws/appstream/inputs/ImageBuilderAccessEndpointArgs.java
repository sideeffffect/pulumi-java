// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageBuilderAccessEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageBuilderAccessEndpointArgs Empty = new ImageBuilderAccessEndpointArgs();

    /**
     * Type of interface endpoint.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * Identifier (ID) of the VPC in which the interface endpoint is used.
     * 
     */
    @Import(name="vpceId")
    private @Nullable Output<String> vpceId;

    public Optional<Output<String>> vpceId() {
        return Optional.ofNullable(this.vpceId);
    }

    private ImageBuilderAccessEndpointArgs() {}

    private ImageBuilderAccessEndpointArgs(ImageBuilderAccessEndpointArgs $) {
        this.endpointType = $.endpointType;
        this.vpceId = $.vpceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageBuilderAccessEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageBuilderAccessEndpointArgs $;

        public Builder() {
            $ = new ImageBuilderAccessEndpointArgs();
        }

        public Builder(ImageBuilderAccessEndpointArgs defaults) {
            $ = new ImageBuilderAccessEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        public Builder vpceId(@Nullable Output<String> vpceId) {
            $.vpceId = vpceId;
            return this;
        }

        public Builder vpceId(String vpceId) {
            return vpceId(Output.of(vpceId));
        }

        public ImageBuilderAccessEndpointArgs build() {
            $.endpointType = Objects.requireNonNull($.endpointType, "expected parameter 'endpointType' to be non-null");
            return $;
        }
    }

}
