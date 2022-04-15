// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesArgs();

    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    @Import(name="ands")
      private final @Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands;

    public Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands() {
        return this.ands == null ? Codegen.empty() : this.ands;
    }

    public ClassificationJobS3JobDefinitionScopingIncludesArgs(@Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands) {
        this.ands = ands;
    }

    private ClassificationJobS3JobDefinitionScopingIncludesArgs() {
        this.ands = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
        }

        public Builder ands(@Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands) {
            this.ands = ands;
            return this;
        }
        public Builder ands(@Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs> ands) {
            this.ands = Codegen.ofNullable(ands);
            return this;
        }
        public Builder ands(ClassificationJobS3JobDefinitionScopingIncludesAndArgs... ands) {
            return ands(List.of(ands));
        }        public ClassificationJobS3JobDefinitionScopingIncludesArgs build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesArgs(ands);
        }
    }
}
