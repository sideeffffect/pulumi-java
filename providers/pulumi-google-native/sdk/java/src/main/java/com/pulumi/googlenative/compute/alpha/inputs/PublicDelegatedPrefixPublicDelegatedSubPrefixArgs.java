// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a sub PublicDelegatedPrefix.
 * 
 */
public final class PublicDelegatedPrefixPublicDelegatedSubPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicDelegatedPrefixPublicDelegatedSubPrefixArgs Empty = new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs();

    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    @Import(name="delegateeProject")
    private @Nullable Output<String> delegateeProject;

    /**
     * @return Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    public Optional<Output<String>> delegateeProject() {
        return Optional.ofNullable(this.delegateeProject);
    }

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
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    /**
     * @return The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    @Import(name="isAddress")
    private @Nullable Output<Boolean> isAddress;

    /**
     * @return Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    public Optional<Output<Boolean>> isAddress() {
        return Optional.ofNullable(this.isAddress);
    }

    /**
     * The name of the sub public delegated prefix.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the sub public delegated prefix.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private PublicDelegatedPrefixPublicDelegatedSubPrefixArgs() {}

    private PublicDelegatedPrefixPublicDelegatedSubPrefixArgs(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs $) {
        this.delegateeProject = $.delegateeProject;
        this.description = $.description;
        this.ipCidrRange = $.ipCidrRange;
        this.isAddress = $.isAddress;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicDelegatedPrefixPublicDelegatedSubPrefixArgs $;

        public Builder() {
            $ = new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs();
        }

        public Builder(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs defaults) {
            $ = new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delegateeProject Name of the project scoping this PublicDelegatedSubPrefix.
         * 
         * @return builder
         * 
         */
        public Builder delegateeProject(@Nullable Output<String> delegateeProject) {
            $.delegateeProject = delegateeProject;
            return this;
        }

        /**
         * @param delegateeProject Name of the project scoping this PublicDelegatedSubPrefix.
         * 
         * @return builder
         * 
         */
        public Builder delegateeProject(String delegateeProject) {
            return delegateeProject(Output.of(delegateeProject));
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
         * @param ipCidrRange The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        /**
         * @param ipCidrRange The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        /**
         * @param isAddress Whether the sub prefix is delegated to create Address resources in the delegatee project.
         * 
         * @return builder
         * 
         */
        public Builder isAddress(@Nullable Output<Boolean> isAddress) {
            $.isAddress = isAddress;
            return this;
        }

        /**
         * @param isAddress Whether the sub prefix is delegated to create Address resources in the delegatee project.
         * 
         * @return builder
         * 
         */
        public Builder isAddress(Boolean isAddress) {
            return isAddress(Output.of(isAddress));
        }

        /**
         * @param name The name of the sub public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the sub public delegated prefix.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PublicDelegatedPrefixPublicDelegatedSubPrefixArgs build() {
            return $;
        }
    }

}
