// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.azurenative.keyvault.enums.CreateMode;
import com.pulumi.azurenative.keyvault.enums.VaultProvisioningState;
import com.pulumi.azurenative.keyvault.inputs.AccessPolicyEntryArgs;
import com.pulumi.azurenative.keyvault.inputs.NetworkRuleSetArgs;
import com.pulumi.azurenative.keyvault.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the vault
 * 
 */
public final class VaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultPropertiesArgs Empty = new VaultPropertiesArgs();

    /**
     * An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
     * 
     */
    @Import(name="accessPolicies")
      private final @Nullable Output<List<AccessPolicyEntryArgs>> accessPolicies;

    public Output<List<AccessPolicyEntryArgs>> accessPolicies() {
        return this.accessPolicies == null ? Codegen.empty() : this.accessPolicies;
    }

    /**
     * The vault's create mode to indicate whether the vault need to be recovered or not.
     * 
     */
    @Import(name="createMode")
      private final @Nullable Output<CreateMode> createMode;

    public Output<CreateMode> createMode() {
        return this.createMode == null ? Codegen.empty() : this.createMode;
    }

    /**
     * Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
     * 
     */
    @Import(name="enablePurgeProtection")
      private final @Nullable Output<Boolean> enablePurgeProtection;

    public Output<Boolean> enablePurgeProtection() {
        return this.enablePurgeProtection == null ? Codegen.empty() : this.enablePurgeProtection;
    }

    /**
     * Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
     * 
     */
    @Import(name="enableRbacAuthorization")
      private final @Nullable Output<Boolean> enableRbacAuthorization;

    public Output<Boolean> enableRbacAuthorization() {
        return this.enableRbacAuthorization == null ? Codegen.empty() : this.enableRbacAuthorization;
    }

    /**
     * Property to specify whether the 'soft delete' functionality is enabled for this key vault. If it's not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    @Import(name="enableSoftDelete")
      private final @Nullable Output<Boolean> enableSoftDelete;

    public Output<Boolean> enableSoftDelete() {
        return this.enableSoftDelete == null ? Codegen.empty() : this.enableSoftDelete;
    }

    /**
     * Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     * 
     */
    @Import(name="enabledForDeployment")
      private final @Nullable Output<Boolean> enabledForDeployment;

    public Output<Boolean> enabledForDeployment() {
        return this.enabledForDeployment == null ? Codegen.empty() : this.enabledForDeployment;
    }

    /**
     * Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     * 
     */
    @Import(name="enabledForDiskEncryption")
      private final @Nullable Output<Boolean> enabledForDiskEncryption;

    public Output<Boolean> enabledForDiskEncryption() {
        return this.enabledForDiskEncryption == null ? Codegen.empty() : this.enabledForDiskEncryption;
    }

    /**
     * Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     * 
     */
    @Import(name="enabledForTemplateDeployment")
      private final @Nullable Output<Boolean> enabledForTemplateDeployment;

    public Output<Boolean> enabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment == null ? Codegen.empty() : this.enabledForTemplateDeployment;
    }

    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    @Import(name="networkAcls")
      private final @Nullable Output<NetworkRuleSetArgs> networkAcls;

    public Output<NetworkRuleSetArgs> networkAcls() {
        return this.networkAcls == null ? Codegen.empty() : this.networkAcls;
    }

    /**
     * Provisioning state of the vault.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,VaultProvisioningState>> provisioningState;

    public Output<Either<String,VaultProvisioningState>> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    /**
     * SKU details
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * softDelete data retention days. It accepts >=7 and <=90.
     * 
     */
    @Import(name="softDeleteRetentionInDays")
      private final @Nullable Output<Integer> softDeleteRetentionInDays;

    public Output<Integer> softDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays == null ? Codegen.empty() : this.softDeleteRetentionInDays;
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    @Import(name="tenantId", required=true)
      private final Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     * The URI of the vault for performing operations on keys and secrets. This property is readonly
     * 
     */
    @Import(name="vaultUri")
      private final @Nullable Output<String> vaultUri;

    public Output<String> vaultUri() {
        return this.vaultUri == null ? Codegen.empty() : this.vaultUri;
    }

    public VaultPropertiesArgs(
        @Nullable Output<List<AccessPolicyEntryArgs>> accessPolicies,
        @Nullable Output<CreateMode> createMode,
        @Nullable Output<Boolean> enablePurgeProtection,
        @Nullable Output<Boolean> enableRbacAuthorization,
        @Nullable Output<Boolean> enableSoftDelete,
        @Nullable Output<Boolean> enabledForDeployment,
        @Nullable Output<Boolean> enabledForDiskEncryption,
        @Nullable Output<Boolean> enabledForTemplateDeployment,
        @Nullable Output<NetworkRuleSetArgs> networkAcls,
        @Nullable Output<Either<String,VaultProvisioningState>> provisioningState,
        Output<SkuArgs> sku,
        @Nullable Output<Integer> softDeleteRetentionInDays,
        Output<String> tenantId,
        @Nullable Output<String> vaultUri) {
        this.accessPolicies = accessPolicies;
        this.createMode = createMode;
        this.enablePurgeProtection = enablePurgeProtection;
        this.enableRbacAuthorization = enableRbacAuthorization == null ? Codegen.ofNullable(false) : enableRbacAuthorization;
        this.enableSoftDelete = enableSoftDelete == null ? Codegen.ofNullable(true) : enableSoftDelete;
        this.enabledForDeployment = enabledForDeployment;
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        this.networkAcls = networkAcls;
        this.provisioningState = provisioningState;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.softDeleteRetentionInDays = softDeleteRetentionInDays == null ? Codegen.ofNullable(90) : softDeleteRetentionInDays;
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.vaultUri = vaultUri;
    }

    private VaultPropertiesArgs() {
        this.accessPolicies = Codegen.empty();
        this.createMode = Codegen.empty();
        this.enablePurgeProtection = Codegen.empty();
        this.enableRbacAuthorization = Codegen.empty();
        this.enableSoftDelete = Codegen.empty();
        this.enabledForDeployment = Codegen.empty();
        this.enabledForDiskEncryption = Codegen.empty();
        this.enabledForTemplateDeployment = Codegen.empty();
        this.networkAcls = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.sku = Codegen.empty();
        this.softDeleteRetentionInDays = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.vaultUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AccessPolicyEntryArgs>> accessPolicies;
        private @Nullable Output<CreateMode> createMode;
        private @Nullable Output<Boolean> enablePurgeProtection;
        private @Nullable Output<Boolean> enableRbacAuthorization;
        private @Nullable Output<Boolean> enableSoftDelete;
        private @Nullable Output<Boolean> enabledForDeployment;
        private @Nullable Output<Boolean> enabledForDiskEncryption;
        private @Nullable Output<Boolean> enabledForTemplateDeployment;
        private @Nullable Output<NetworkRuleSetArgs> networkAcls;
        private @Nullable Output<Either<String,VaultProvisioningState>> provisioningState;
        private Output<SkuArgs> sku;
        private @Nullable Output<Integer> softDeleteRetentionInDays;
        private Output<String> tenantId;
        private @Nullable Output<String> vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.createMode = defaults.createMode;
    	      this.enablePurgeProtection = defaults.enablePurgeProtection;
    	      this.enableRbacAuthorization = defaults.enableRbacAuthorization;
    	      this.enableSoftDelete = defaults.enableSoftDelete;
    	      this.enabledForDeployment = defaults.enabledForDeployment;
    	      this.enabledForDiskEncryption = defaults.enabledForDiskEncryption;
    	      this.enabledForTemplateDeployment = defaults.enabledForTemplateDeployment;
    	      this.networkAcls = defaults.networkAcls;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.softDeleteRetentionInDays = defaults.softDeleteRetentionInDays;
    	      this.tenantId = defaults.tenantId;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder accessPolicies(@Nullable Output<List<AccessPolicyEntryArgs>> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder accessPolicies(@Nullable List<AccessPolicyEntryArgs> accessPolicies) {
            this.accessPolicies = Codegen.ofNullable(accessPolicies);
            return this;
        }
        public Builder accessPolicies(AccessPolicyEntryArgs... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }
        public Builder createMode(@Nullable Output<CreateMode> createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder createMode(@Nullable CreateMode createMode) {
            this.createMode = Codegen.ofNullable(createMode);
            return this;
        }
        public Builder enablePurgeProtection(@Nullable Output<Boolean> enablePurgeProtection) {
            this.enablePurgeProtection = enablePurgeProtection;
            return this;
        }
        public Builder enablePurgeProtection(@Nullable Boolean enablePurgeProtection) {
            this.enablePurgeProtection = Codegen.ofNullable(enablePurgeProtection);
            return this;
        }
        public Builder enableRbacAuthorization(@Nullable Output<Boolean> enableRbacAuthorization) {
            this.enableRbacAuthorization = enableRbacAuthorization;
            return this;
        }
        public Builder enableRbacAuthorization(@Nullable Boolean enableRbacAuthorization) {
            this.enableRbacAuthorization = Codegen.ofNullable(enableRbacAuthorization);
            return this;
        }
        public Builder enableSoftDelete(@Nullable Output<Boolean> enableSoftDelete) {
            this.enableSoftDelete = enableSoftDelete;
            return this;
        }
        public Builder enableSoftDelete(@Nullable Boolean enableSoftDelete) {
            this.enableSoftDelete = Codegen.ofNullable(enableSoftDelete);
            return this;
        }
        public Builder enabledForDeployment(@Nullable Output<Boolean> enabledForDeployment) {
            this.enabledForDeployment = enabledForDeployment;
            return this;
        }
        public Builder enabledForDeployment(@Nullable Boolean enabledForDeployment) {
            this.enabledForDeployment = Codegen.ofNullable(enabledForDeployment);
            return this;
        }
        public Builder enabledForDiskEncryption(@Nullable Output<Boolean> enabledForDiskEncryption) {
            this.enabledForDiskEncryption = enabledForDiskEncryption;
            return this;
        }
        public Builder enabledForDiskEncryption(@Nullable Boolean enabledForDiskEncryption) {
            this.enabledForDiskEncryption = Codegen.ofNullable(enabledForDiskEncryption);
            return this;
        }
        public Builder enabledForTemplateDeployment(@Nullable Output<Boolean> enabledForTemplateDeployment) {
            this.enabledForTemplateDeployment = enabledForTemplateDeployment;
            return this;
        }
        public Builder enabledForTemplateDeployment(@Nullable Boolean enabledForTemplateDeployment) {
            this.enabledForTemplateDeployment = Codegen.ofNullable(enabledForTemplateDeployment);
            return this;
        }
        public Builder networkAcls(@Nullable Output<NetworkRuleSetArgs> networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }
        public Builder networkAcls(@Nullable NetworkRuleSetArgs networkAcls) {
            this.networkAcls = Codegen.ofNullable(networkAcls);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,VaultProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,VaultProvisioningState> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder softDeleteRetentionInDays(@Nullable Output<Integer> softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }
        public Builder softDeleteRetentionInDays(@Nullable Integer softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = Codegen.ofNullable(softDeleteRetentionInDays);
            return this;
        }
        public Builder tenantId(Output<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Output.of(Objects.requireNonNull(tenantId));
            return this;
        }
        public Builder vaultUri(@Nullable Output<String> vaultUri) {
            this.vaultUri = vaultUri;
            return this;
        }
        public Builder vaultUri(@Nullable String vaultUri) {
            this.vaultUri = Codegen.ofNullable(vaultUri);
            return this;
        }        public VaultPropertiesArgs build() {
            return new VaultPropertiesArgs(accessPolicies, createMode, enablePurgeProtection, enableRbacAuthorization, enableSoftDelete, enabledForDeployment, enabledForDiskEncryption, enabledForTemplateDeployment, networkAcls, provisioningState, sku, softDeleteRetentionInDays, tenantId, vaultUri);
        }
    }
}
