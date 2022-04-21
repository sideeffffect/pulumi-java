// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppPremierAddOnArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppPremierAddOnArgs Empty = new GetWebAppPremierAddOnArgs();

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Add-on name.
     * 
     */
    @Import(name="premierAddOnName", required=true)
    private String premierAddOnName;

    public String premierAddOnName() {
        return this.premierAddOnName;
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

    private GetWebAppPremierAddOnArgs() {}

    private GetWebAppPremierAddOnArgs(GetWebAppPremierAddOnArgs $) {
        this.name = $.name;
        this.premierAddOnName = $.premierAddOnName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppPremierAddOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppPremierAddOnArgs $;

        public Builder() {
            $ = new GetWebAppPremierAddOnArgs();
        }

        public Builder(GetWebAppPremierAddOnArgs defaults) {
            $ = new GetWebAppPremierAddOnArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder premierAddOnName(String premierAddOnName) {
            $.premierAddOnName = premierAddOnName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetWebAppPremierAddOnArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.premierAddOnName = Objects.requireNonNull($.premierAddOnName, "expected parameter 'premierAddOnName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
