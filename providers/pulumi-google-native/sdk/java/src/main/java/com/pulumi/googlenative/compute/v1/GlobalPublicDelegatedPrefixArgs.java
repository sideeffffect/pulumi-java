// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.inputs.PublicDelegatedPrefixPublicDelegatedSubPrefixArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalPublicDelegatedPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalPublicDelegatedPrefixArgs Empty = new GlobalPublicDelegatedPrefixArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    /**
     * @return The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * If true, the prefix will be live migrated.
     * 
     */
    @Import(name="isLiveMigration")
    private @Nullable Output<Boolean> isLiveMigration;

    /**
     * @return If true, the prefix will be live migrated.
     * 
     */
    public Optional<Output<Boolean>> isLiveMigration() {
        return Optional.ofNullable(this.isLiveMigration);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    @Import(name="parentPrefix")
    private @Nullable Output<String> parentPrefix;

    /**
     * @return The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    public Optional<Output<String>> parentPrefix() {
        return Optional.ofNullable(this.parentPrefix);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    @Import(name="publicDelegatedSubPrefixs")
    private @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;

    /**
     * @return The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    public Optional<Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>>> publicDelegatedSubPrefixs() {
        return Optional.ofNullable(this.publicDelegatedSubPrefixs);
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private GlobalPublicDelegatedPrefixArgs() {}

    private GlobalPublicDelegatedPrefixArgs(GlobalPublicDelegatedPrefixArgs $) {
        this.description = $.description;
        this.ipCidrRange = $.ipCidrRange;
        this.isLiveMigration = $.isLiveMigration;
        this.name = $.name;
        this.parentPrefix = $.parentPrefix;
        this.project = $.project;
        this.publicDelegatedSubPrefixs = $.publicDelegatedSubPrefixs;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalPublicDelegatedPrefixArgs $;

        public Builder() {
            $ = new GlobalPublicDelegatedPrefixArgs();
        }

        public Builder(GlobalPublicDelegatedPrefixArgs defaults) {
            $ = new GlobalPublicDelegatedPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipCidrRange The IPv4 address range, in CIDR format, represented by this public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        /**
         * @param ipCidrRange The IPv4 address range, in CIDR format, represented by this public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        /**
         * @param isLiveMigration If true, the prefix will be live migrated.
         * 
         * @return builder
         * 
         */
        public Builder isLiveMigration(@Nullable Output<Boolean> isLiveMigration) {
            $.isLiveMigration = isLiveMigration;
            return this;
        }

        /**
         * @param isLiveMigration If true, the prefix will be live migrated.
         * 
         * @return builder
         * 
         */
        public Builder isLiveMigration(Boolean isLiveMigration) {
            return isLiveMigration(Output.of(isLiveMigration));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentPrefix The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
         * 
         * @return builder
         * 
         */
        public Builder parentPrefix(@Nullable Output<String> parentPrefix) {
            $.parentPrefix = parentPrefix;
            return this;
        }

        /**
         * @param parentPrefix The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
         * 
         * @return builder
         * 
         */
        public Builder parentPrefix(String parentPrefix) {
            return parentPrefix(Output.of(parentPrefix));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param publicDelegatedSubPrefixs The list of sub public delegated prefixes that exist for this public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder publicDelegatedSubPrefixs(@Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs) {
            $.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
            return this;
        }

        /**
         * @param publicDelegatedSubPrefixs The list of sub public delegated prefixes that exist for this public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder publicDelegatedSubPrefixs(List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs> publicDelegatedSubPrefixs) {
            return publicDelegatedSubPrefixs(Output.of(publicDelegatedSubPrefixs));
        }

        /**
         * @param publicDelegatedSubPrefixs The list of sub public delegated prefixes that exist for this public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder publicDelegatedSubPrefixs(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs... publicDelegatedSubPrefixs) {
            return publicDelegatedSubPrefixs(List.of(publicDelegatedSubPrefixs));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public GlobalPublicDelegatedPrefixArgs build() {
            return $;
        }
    }

}
