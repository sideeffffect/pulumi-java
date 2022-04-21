// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.KeyVaultReference;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListIntegrationAccountKeyVaultKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountKeyVaultKeysArgs Empty = new ListIntegrationAccountKeyVaultKeysArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    public String integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key vault reference.
     * 
     */
    @Import(name="keyVault", required=true)
    private KeyVaultReference keyVault;

    public KeyVaultReference keyVault() {
        return this.keyVault;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The skip token.
     * 
     */
    @Import(name="skipToken")
    private @Nullable String skipToken;

    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    private ListIntegrationAccountKeyVaultKeysArgs() {}

    private ListIntegrationAccountKeyVaultKeysArgs(ListIntegrationAccountKeyVaultKeysArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.keyVault = $.keyVault;
        this.resourceGroupName = $.resourceGroupName;
        this.skipToken = $.skipToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIntegrationAccountKeyVaultKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIntegrationAccountKeyVaultKeysArgs $;

        public Builder() {
            $ = new ListIntegrationAccountKeyVaultKeysArgs();
        }

        public Builder(ListIntegrationAccountKeyVaultKeysArgs defaults) {
            $ = new ListIntegrationAccountKeyVaultKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        public Builder keyVault(KeyVaultReference keyVault) {
            $.keyVault = keyVault;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder skipToken(@Nullable String skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        public ListIntegrationAccountKeyVaultKeysArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.keyVault = Objects.requireNonNull($.keyVault, "expected parameter 'keyVault' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
