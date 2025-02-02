// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact.outputs;

import com.pulumi.awsnative.codeartifact.outputs.RepositoryTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRepositoryResult {
    /**
     * @return The ARN of the repository.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return A text description of the repository.
     * 
     */
    private final @Nullable String description;
    /**
     * @return A list of external connections associated with the repository.
     * 
     */
    private final @Nullable List<String> externalConnections;
    /**
     * @return The name of the repository. This is used for GetAtt
     * 
     */
    private final @Nullable String name;
    /**
     * @return The access control resource policy on the provided repository.
     * 
     */
    private final @Nullable Object permissionsPolicyDocument;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<RepositoryTag> tags;
    /**
     * @return A list of upstream repositories associated with the repository.
     * 
     */
    private final @Nullable List<String> upstreams;

    @CustomType.Constructor
    private GetRepositoryResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("externalConnections") @Nullable List<String> externalConnections,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("permissionsPolicyDocument") @Nullable Object permissionsPolicyDocument,
        @CustomType.Parameter("tags") @Nullable List<RepositoryTag> tags,
        @CustomType.Parameter("upstreams") @Nullable List<String> upstreams) {
        this.arn = arn;
        this.description = description;
        this.externalConnections = externalConnections;
        this.name = name;
        this.permissionsPolicyDocument = permissionsPolicyDocument;
        this.tags = tags;
        this.upstreams = upstreams;
    }

    /**
     * @return The ARN of the repository.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return A text description of the repository.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A list of external connections associated with the repository.
     * 
     */
    public List<String> externalConnections() {
        return this.externalConnections == null ? List.of() : this.externalConnections;
    }
    /**
     * @return The name of the repository. This is used for GetAtt
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The access control resource policy on the provided repository.
     * 
     */
    public Optional<Object> permissionsPolicyDocument() {
        return Optional.ofNullable(this.permissionsPolicyDocument);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<RepositoryTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return A list of upstream repositories associated with the repository.
     * 
     */
    public List<String> upstreams() {
        return this.upstreams == null ? List.of() : this.upstreams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable List<String> externalConnections;
        private @Nullable String name;
        private @Nullable Object permissionsPolicyDocument;
        private @Nullable List<RepositoryTag> tags;
        private @Nullable List<String> upstreams;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.externalConnections = defaults.externalConnections;
    	      this.name = defaults.name;
    	      this.permissionsPolicyDocument = defaults.permissionsPolicyDocument;
    	      this.tags = defaults.tags;
    	      this.upstreams = defaults.upstreams;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder externalConnections(@Nullable List<String> externalConnections) {
            this.externalConnections = externalConnections;
            return this;
        }
        public Builder externalConnections(String... externalConnections) {
            return externalConnections(List.of(externalConnections));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder permissionsPolicyDocument(@Nullable Object permissionsPolicyDocument) {
            this.permissionsPolicyDocument = permissionsPolicyDocument;
            return this;
        }
        public Builder tags(@Nullable List<RepositoryTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(RepositoryTag... tags) {
            return tags(List.of(tags));
        }
        public Builder upstreams(@Nullable List<String> upstreams) {
            this.upstreams = upstreams;
            return this;
        }
        public Builder upstreams(String... upstreams) {
            return upstreams(List.of(upstreams));
        }        public GetRepositoryResult build() {
            return new GetRepositoryResult(arn, description, externalConnections, name, permissionsPolicyDocument, tags, upstreams);
        }
    }
}
