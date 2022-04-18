// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector;

import com.pulumi.awsnative.frauddetector.inputs.OutcomeTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OutcomeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutcomeArgs Empty = new OutcomeArgs();

    /**
     * The outcome description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the outcome.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Tags associated with this outcome.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<OutcomeTagArgs>> tags;

    public Output<List<OutcomeTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public OutcomeArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<OutcomeTagArgs>> tags) {
        this.description = description;
        this.name = name;
        this.tags = tags;
    }

    private OutcomeArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutcomeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<OutcomeTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OutcomeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<OutcomeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<OutcomeTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(OutcomeTagArgs... tags) {
            return tags(List.of(tags));
        }        public OutcomeArgs build() {
            return new OutcomeArgs(description, name, tags);
        }
    }
}
