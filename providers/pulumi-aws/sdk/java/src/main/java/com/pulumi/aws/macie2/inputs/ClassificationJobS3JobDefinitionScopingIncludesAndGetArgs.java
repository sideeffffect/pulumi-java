// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs;
import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs();

    /**
     * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
     */
    @Import(name="simpleScopeTerm")
    private @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs> simpleScopeTerm;

    public Optional<Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs>> simpleScopeTerm() {
        return Optional.ofNullable(this.simpleScopeTerm);
    }

    /**
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
     */
    @Import(name="tagScopeTerm")
    private @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermGetArgs> tagScopeTerm;

    public Optional<Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermGetArgs>> tagScopeTerm() {
        return Optional.ofNullable(this.tagScopeTerm);
    }

    private ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs() {}

    private ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs(ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs $) {
        this.simpleScopeTerm = $.simpleScopeTerm;
        this.tagScopeTerm = $.tagScopeTerm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder simpleScopeTerm(@Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs> simpleScopeTerm) {
            $.simpleScopeTerm = simpleScopeTerm;
            return this;
        }

        public Builder simpleScopeTerm(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs simpleScopeTerm) {
            return simpleScopeTerm(Output.of(simpleScopeTerm));
        }

        public Builder tagScopeTerm(@Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermGetArgs> tagScopeTerm) {
            $.tagScopeTerm = tagScopeTerm;
            return this;
        }

        public Builder tagScopeTerm(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermGetArgs tagScopeTerm) {
            return tagScopeTerm(Output.of(tagScopeTerm));
        }

        public ClassificationJobS3JobDefinitionScopingIncludesAndGetArgs build() {
            return $;
        }
    }

}
