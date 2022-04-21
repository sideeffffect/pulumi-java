// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListMonitorUserRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListMonitorUserRolesArgs Empty = new ListMonitorUserRolesArgs();

    /**
     * Email of the user used by Logz for contacting them if needed
     * 
     */
    @Import(name="emailAddress")
    private @Nullable String emailAddress;

    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private String monitorName;

    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListMonitorUserRolesArgs() {}

    private ListMonitorUserRolesArgs(ListMonitorUserRolesArgs $) {
        this.emailAddress = $.emailAddress;
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMonitorUserRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMonitorUserRolesArgs $;

        public Builder() {
            $ = new ListMonitorUserRolesArgs();
        }

        public Builder(ListMonitorUserRolesArgs defaults) {
            $ = new ListMonitorUserRolesArgs(Objects.requireNonNull(defaults));
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public Builder monitorName(String monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListMonitorUserRolesArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
