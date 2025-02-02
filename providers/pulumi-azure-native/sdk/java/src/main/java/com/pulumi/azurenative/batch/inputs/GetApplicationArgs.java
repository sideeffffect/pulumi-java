// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the application. This must be unique within the account.
     * 
     */
    @Import(name="applicationName", required=true)
    private Output<String> applicationName;

    /**
     * @return The name of the application. This must be unique within the account.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the Batch account.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetApplicationArgs() {}

    private GetApplicationArgs(GetApplicationArgs $) {
        this.accountName = $.accountName;
        this.applicationName = $.applicationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationArgs $;

        public Builder() {
            $ = new GetApplicationArgs();
        }

        public Builder(GetApplicationArgs defaults) {
            $ = new GetApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param applicationName The name of the application. This must be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The name of the application. This must be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetApplicationArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
