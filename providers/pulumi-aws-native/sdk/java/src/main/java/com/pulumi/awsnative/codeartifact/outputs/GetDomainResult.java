// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact.outputs;

import com.pulumi.awsnative.codeartifact.outputs.DomainTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainResult {
    /**
     * The ARN of the domain.
     * 
     */
    private final @Nullable String arn;
    /**
     * The name of the domain. This field is used for GetAtt
     * 
     */
    private final @Nullable String name;
    /**
     * The 12-digit account ID of the AWS account that owns the domain. This field is used for GetAtt
     * 
     */
    private final @Nullable String owner;
    /**
     * The access control resource policy on the provided domain.
     * 
     */
    private final @Nullable Object permissionsPolicyDocument;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<DomainTag> tags;

    @CustomType.Constructor
    private GetDomainResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("owner") @Nullable String owner,
        @CustomType.Parameter("permissionsPolicyDocument") @Nullable Object permissionsPolicyDocument,
        @CustomType.Parameter("tags") @Nullable List<DomainTag> tags) {
        this.arn = arn;
        this.name = name;
        this.owner = owner;
        this.permissionsPolicyDocument = permissionsPolicyDocument;
        this.tags = tags;
    }

    /**
     * The ARN of the domain.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The name of the domain. This field is used for GetAtt
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The 12-digit account ID of the AWS account that owns the domain. This field is used for GetAtt
     * 
    */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * The access control resource policy on the provided domain.
     * 
    */
    public Optional<Object> permissionsPolicyDocument() {
        return Optional.ofNullable(this.permissionsPolicyDocument);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<DomainTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable Object permissionsPolicyDocument;
        private @Nullable List<DomainTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.permissionsPolicyDocument = defaults.permissionsPolicyDocument;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public Builder permissionsPolicyDocument(@Nullable Object permissionsPolicyDocument) {
            this.permissionsPolicyDocument = permissionsPolicyDocument;
            return this;
        }
        public Builder tags(@Nullable List<DomainTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DomainTag... tags) {
            return tags(List.of(tags));
        }        public GetDomainResult build() {
            return new GetDomainResult(arn, name, owner, permissionsPolicyDocument, tags);
        }
    }
}
