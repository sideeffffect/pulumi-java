// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyGroupArgs Empty = new KeyGroupArgs();

    /**
     * A comment to describe the key group..
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> comment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * A list of the identifiers of the public keys in the key group.
     * 
     */
    @Import(name="items", required=true)
      private final Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items;
    }

    /**
     * A name to identify the key group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public KeyGroupArgs(
        @Nullable Output<String> comment,
        Output<List<String>> items,
        @Nullable Output<String> name) {
        this.comment = comment;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.name = name;
    }

    private KeyGroupArgs() {
        this.comment = Codegen.empty();
        this.items = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private Output<List<String>> items;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder items(Output<List<String>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(List<String> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public KeyGroupArgs build() {
            return new KeyGroupArgs(comment, items, name);
        }
    }
}
