// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReferenceImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReferenceImageArgs Empty = new GetReferenceImageArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="productId", required=true)
    private Output<String> productId;

    public Output<String> productId() {
        return this.productId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="referenceImageId", required=true)
    private Output<String> referenceImageId;

    public Output<String> referenceImageId() {
        return this.referenceImageId;
    }

    private GetReferenceImageArgs() {}

    private GetReferenceImageArgs(GetReferenceImageArgs $) {
        this.location = $.location;
        this.productId = $.productId;
        this.project = $.project;
        this.referenceImageId = $.referenceImageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReferenceImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReferenceImageArgs $;

        public Builder() {
            $ = new GetReferenceImageArgs();
        }

        public Builder(GetReferenceImageArgs defaults) {
            $ = new GetReferenceImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder referenceImageId(Output<String> referenceImageId) {
            $.referenceImageId = referenceImageId;
            return this;
        }

        public Builder referenceImageId(String referenceImageId) {
            return referenceImageId(Output.of(referenceImageId));
        }

        public GetReferenceImageArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.referenceImageId = Objects.requireNonNull($.referenceImageId, "expected parameter 'referenceImageId' to be non-null");
            return $;
        }
    }

}
