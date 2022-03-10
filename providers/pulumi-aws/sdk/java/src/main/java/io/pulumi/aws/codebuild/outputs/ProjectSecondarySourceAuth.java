// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectSecondarySourceAuth {
    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    private final @Nullable String resource;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    private final String type;

    @OutputCustomType.Constructor
    private ProjectSecondarySourceAuth(
        @OutputCustomType.Parameter("resource") @Nullable String resource,
        @OutputCustomType.Parameter("type") String type) {
        this.resource = resource;
        this.type = type;
    }

    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
    */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Optional<String> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
    */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resource;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectSecondarySourceAuth build() {
            return new ProjectSecondarySourceAuth(resource, type);
        }
    }
}
