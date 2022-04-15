// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesAndArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesAndArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesAndArgs();

    /**
     * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
     */
    @Import(name="simpleScopeTerm")
      private final @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs> simpleScopeTerm;

    public Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs> simpleScopeTerm() {
        return this.simpleScopeTerm == null ? Codegen.empty() : this.simpleScopeTerm;
    }

    /**
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
     */
    @Import(name="tagScopeTerm")
      private final @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs> tagScopeTerm;

    public Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs> tagScopeTerm() {
        return this.tagScopeTerm == null ? Codegen.empty() : this.tagScopeTerm;
    }

    public ClassificationJobS3JobDefinitionScopingIncludesAndArgs(
        @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs> simpleScopeTerm,
        @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs> tagScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
        this.tagScopeTerm = tagScopeTerm;
    }

    private ClassificationJobS3JobDefinitionScopingIncludesAndArgs() {
        this.simpleScopeTerm = Codegen.empty();
        this.tagScopeTerm = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs> simpleScopeTerm;
        private @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs> tagScopeTerm;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleScopeTerm = defaults.simpleScopeTerm;
    	      this.tagScopeTerm = defaults.tagScopeTerm;
        }

        public Builder simpleScopeTerm(@Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs> simpleScopeTerm) {
            this.simpleScopeTerm = simpleScopeTerm;
            return this;
        }
        public Builder simpleScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs simpleScopeTerm) {
            this.simpleScopeTerm = Codegen.ofNullable(simpleScopeTerm);
            return this;
        }
        public Builder tagScopeTerm(@Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs> tagScopeTerm) {
            this.tagScopeTerm = tagScopeTerm;
            return this;
        }
        public Builder tagScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs tagScopeTerm) {
            this.tagScopeTerm = Codegen.ofNullable(tagScopeTerm);
            return this;
        }        public ClassificationJobS3JobDefinitionScopingIncludesAndArgs build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesAndArgs(simpleScopeTerm, tagScopeTerm);
        }
    }
}
