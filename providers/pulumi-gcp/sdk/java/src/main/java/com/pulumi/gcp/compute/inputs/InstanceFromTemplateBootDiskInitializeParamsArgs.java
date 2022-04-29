// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromTemplateBootDiskInitializeParamsArgs extends ResourceArgs {

    public static final InstanceFromTemplateBootDiskInitializeParamsArgs Empty = new InstanceFromTemplateBootDiskInitializeParamsArgs();

    @Import(name="image")
    private @Nullable Output<String> image;

    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="size")
    private @Nullable Output<Integer> size;

    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private InstanceFromTemplateBootDiskInitializeParamsArgs() {}

    private InstanceFromTemplateBootDiskInitializeParamsArgs(InstanceFromTemplateBootDiskInitializeParamsArgs $) {
        this.image = $.image;
        this.labels = $.labels;
        this.size = $.size;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromTemplateBootDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromTemplateBootDiskInitializeParamsArgs $;

        public Builder() {
            $ = new InstanceFromTemplateBootDiskInitializeParamsArgs();
        }

        public Builder(InstanceFromTemplateBootDiskInitializeParamsArgs defaults) {
            $ = new InstanceFromTemplateBootDiskInitializeParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InstanceFromTemplateBootDiskInitializeParamsArgs build() {
            return $;
        }
    }

}
