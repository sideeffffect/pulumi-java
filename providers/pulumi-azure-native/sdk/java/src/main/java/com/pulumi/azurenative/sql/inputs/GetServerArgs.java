// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerArgs Empty = new GetServerArgs();

    /**
     * The child resources to include in the response.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    public String serverName() {
        return this.serverName;
    }

    private GetServerArgs() {}

    private GetServerArgs(GetServerArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerArgs $;

        public Builder() {
            $ = new GetServerArgs();
        }

        public Builder(GetServerArgs defaults) {
            $ = new GetServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetServerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
