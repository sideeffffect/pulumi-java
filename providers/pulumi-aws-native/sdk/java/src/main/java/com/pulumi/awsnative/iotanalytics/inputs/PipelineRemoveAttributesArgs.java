// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineRemoveAttributesArgs extends ResourceArgs {

    public static final PipelineRemoveAttributesArgs Empty = new PipelineRemoveAttributesArgs();

    @Import(name="attributes", required=true)
    private Output<List<String>> attributes;

    public Output<List<String>> attributes() {
        return this.attributes;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="next")
    private @Nullable Output<String> next;

    public Optional<Output<String>> next() {
        return Optional.ofNullable(this.next);
    }

    private PipelineRemoveAttributesArgs() {}

    private PipelineRemoveAttributesArgs(PipelineRemoveAttributesArgs $) {
        this.attributes = $.attributes;
        this.name = $.name;
        this.next = $.next;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineRemoveAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineRemoveAttributesArgs $;

        public Builder() {
            $ = new PipelineRemoveAttributesArgs();
        }

        public Builder(PipelineRemoveAttributesArgs defaults) {
            $ = new PipelineRemoveAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributes(Output<List<String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        public Builder attributes(List<String> attributes) {
            return attributes(Output.of(attributes));
        }

        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder next(@Nullable Output<String> next) {
            $.next = next;
            return this;
        }

        public Builder next(String next) {
            return next(Output.of(next));
        }

        public PipelineRemoveAttributesArgs build() {
            $.attributes = Objects.requireNonNull($.attributes, "expected parameter 'attributes' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
