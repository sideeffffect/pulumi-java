// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.PublicDelegatedPrefixPublicDelegatedSubPrefixResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetGlobalPublicDelegatedPrefixResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
     * 
     */
    private final String fingerprint;
    /**
     * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    private final String ipCidrRange;
    /**
     * If true, the prefix will be live migrated.
     * 
     */
    private final Boolean isLiveMigration;
    /**
     * Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    private final String parentPrefix;
    /**
     * The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    private final List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs;
    /**
     * URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL with id for the resource.
     * 
     */
    private final String selfLinkWithId;
    /**
     * The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"creationTimestamp","description","fingerprint","ipCidrRange","isLiveMigration","kind","name","parentPrefix","publicDelegatedSubPrefixs","region","selfLink","selfLinkWithId","status"})
    private GetGlobalPublicDelegatedPrefixResult(
        String creationTimestamp,
        String description,
        String fingerprint,
        String ipCidrRange,
        Boolean isLiveMigration,
        String kind,
        String name,
        String parentPrefix,
        List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs,
        String region,
        String selfLink,
        String selfLinkWithId,
        String status) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.ipCidrRange = ipCidrRange;
        this.isLiveMigration = isLiveMigration;
        this.kind = kind;
        this.name = name;
        this.parentPrefix = parentPrefix;
        this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.status = status;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
    */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * If true, the prefix will be live migrated.
     * 
    */
    public Boolean getIsLiveMigration() {
        return this.isLiveMigration;
    }
    /**
     * Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
    */
    public String getParentPrefix() {
        return this.parentPrefix;
    }
    /**
     * The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
    */
    public List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> getPublicDelegatedSubPrefixs() {
        return this.publicDelegatedSubPrefixs;
    }
    /**
     * URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL with id for the resource.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalPublicDelegatedPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String ipCidrRange;
        private Boolean isLiveMigration;
        private String kind;
        private String name;
        private String parentPrefix;
        private List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalPublicDelegatedPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isLiveMigration = defaults.isLiveMigration;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.parentPrefix = defaults.parentPrefix;
    	      this.publicDelegatedSubPrefixs = defaults.publicDelegatedSubPrefixs;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.status = defaults.status;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setIsLiveMigration(Boolean isLiveMigration) {
            this.isLiveMigration = Objects.requireNonNull(isLiveMigration);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParentPrefix(String parentPrefix) {
            this.parentPrefix = Objects.requireNonNull(parentPrefix);
            return this;
        }

        public Builder setPublicDelegatedSubPrefixs(List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = Objects.requireNonNull(publicDelegatedSubPrefixs);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetGlobalPublicDelegatedPrefixResult build() {
            return new GetGlobalPublicDelegatedPrefixResult(creationTimestamp, description, fingerprint, ipCidrRange, isLiveMigration, kind, name, parentPrefix, publicDelegatedSubPrefixs, region, selfLink, selfLinkWithId, status);
        }
    }
}
