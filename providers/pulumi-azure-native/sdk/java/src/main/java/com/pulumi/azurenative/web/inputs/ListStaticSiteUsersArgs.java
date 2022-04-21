// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListStaticSiteUsersArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListStaticSiteUsersArgs Empty = new ListStaticSiteUsersArgs();

    /**
     * The auth provider for the users.
     * 
     */
    @Import(name="authprovider", required=true)
    private String authprovider;

    public String authprovider() {
        return this.authprovider;
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListStaticSiteUsersArgs() {}

    private ListStaticSiteUsersArgs(ListStaticSiteUsersArgs $) {
        this.authprovider = $.authprovider;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListStaticSiteUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListStaticSiteUsersArgs $;

        public Builder() {
            $ = new ListStaticSiteUsersArgs();
        }

        public Builder(ListStaticSiteUsersArgs defaults) {
            $ = new ListStaticSiteUsersArgs(Objects.requireNonNull(defaults));
        }

        public Builder authprovider(String authprovider) {
            $.authprovider = authprovider;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListStaticSiteUsersArgs build() {
            $.authprovider = Objects.requireNonNull($.authprovider, "expected parameter 'authprovider' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
