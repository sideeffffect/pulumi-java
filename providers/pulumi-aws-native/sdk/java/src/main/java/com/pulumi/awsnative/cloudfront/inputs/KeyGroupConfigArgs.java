// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyGroupConfigArgs extends ResourceArgs {

    public static final KeyGroupConfigArgs Empty = new KeyGroupConfigArgs();

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="items", required=true)
    private Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private KeyGroupConfigArgs() {}

    private KeyGroupConfigArgs(KeyGroupConfigArgs $) {
        this.comment = $.comment;
        this.items = $.items;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyGroupConfigArgs $;

        public Builder() {
            $ = new KeyGroupConfigArgs();
        }

        public Builder(KeyGroupConfigArgs defaults) {
            $ = new KeyGroupConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder items(Output<List<String>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public KeyGroupConfigArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
