// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.VaultLockConfigurationArgs;
import io.pulumi.aws.backup.inputs.VaultLockConfigurationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup vault lock configuration resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Backup vault lock configuration can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:backup/vaultLockConfiguration:VaultLockConfiguration test TestVault
 * ```
 * 
 */
@ResourceType(type="aws:backup/vaultLockConfiguration:VaultLockConfiguration")
public class VaultLockConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the vault.
     * 
     */
    @Export(name="backupVaultArn", type=String.class, parameters={})
    private Output<String> backupVaultArn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Output<String> backupVaultArn() {
        return this.backupVaultArn;
    }
    /**
     * Name of the backup vault to add a lock configuration for.
     * 
     */
    @Export(name="backupVaultName", type=String.class, parameters={})
    private Output<String> backupVaultName;

    /**
     * @return Name of the backup vault to add a lock configuration for.
     * 
     */
    public Output<String> backupVaultName() {
        return this.backupVaultName;
    }
    /**
     * The number of days before the lock date.
     * 
     */
    @Export(name="changeableForDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> changeableForDays;

    /**
     * @return The number of days before the lock date.
     * 
     */
    public Output</* @Nullable */ Integer> changeableForDays() {
        return this.changeableForDays;
    }
    /**
     * The maximum retention period that the vault retains its recovery points.
     * 
     */
    @Export(name="maxRetentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxRetentionDays;

    /**
     * @return The maximum retention period that the vault retains its recovery points.
     * 
     */
    public Output</* @Nullable */ Integer> maxRetentionDays() {
        return this.maxRetentionDays;
    }
    /**
     * The minimum retention period that the vault retains its recovery points.
     * 
     */
    @Export(name="minRetentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minRetentionDays;

    /**
     * @return The minimum retention period that the vault retains its recovery points.
     * 
     */
    public Output</* @Nullable */ Integer> minRetentionDays() {
        return this.minRetentionDays;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VaultLockConfiguration(String name) {
        this(name, VaultLockConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VaultLockConfiguration(String name, VaultLockConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VaultLockConfiguration(String name, VaultLockConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vaultLockConfiguration:VaultLockConfiguration", name, args == null ? VaultLockConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VaultLockConfiguration(String name, Output<String> id, @Nullable VaultLockConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vaultLockConfiguration:VaultLockConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VaultLockConfiguration get(String name, Output<String> id, @Nullable VaultLockConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VaultLockConfiguration(name, id, state, options);
    }
}
