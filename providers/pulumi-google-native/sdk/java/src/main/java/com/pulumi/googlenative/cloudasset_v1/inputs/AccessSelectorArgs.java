// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies roles and/or permissions to analyze, to determine both the identities possessing them and the resources they control. If multiple values are specified, results will include roles or permissions matching any of them. The total number of roles and permissions should be equal or less than 10.
 * 
 */
public final class AccessSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessSelectorArgs Empty = new AccessSelectorArgs();

    /**
     * Optional. The permissions to appear in result.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Optional. The roles to appear in result.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    private AccessSelectorArgs() {}

    private AccessSelectorArgs(AccessSelectorArgs $) {
        this.permissions = $.permissions;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessSelectorArgs $;

        public Builder() {
            $ = new AccessSelectorArgs();
        }

        public Builder(AccessSelectorArgs defaults) {
            $ = new AccessSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        public AccessSelectorArgs build() {
            return $;
        }
    }

}
