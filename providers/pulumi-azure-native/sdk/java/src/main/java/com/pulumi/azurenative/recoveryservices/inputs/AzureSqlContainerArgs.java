// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Sql workload-specific container.
 * 
 */
public final class AzureSqlContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureSqlContainerArgs Empty = new AzureSqlContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Optional<Output<Either<String,BackupManagementType>>> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;AzureSqlContainer&#39;.
     * 
     */
    @Import(name="containerType", required=true)
    private Output<String> containerType;

    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
    private @Nullable Output<String> healthStatus;

    public Optional<Output<String>> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
    private @Nullable Output<String> registrationStatus;

    public Optional<Output<String>> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    private AzureSqlContainerArgs() {}

    private AzureSqlContainerArgs(AzureSqlContainerArgs $) {
        this.backupManagementType = $.backupManagementType;
        this.containerType = $.containerType;
        this.friendlyName = $.friendlyName;
        this.healthStatus = $.healthStatus;
        this.registrationStatus = $.registrationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSqlContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSqlContainerArgs $;

        public Builder() {
            $ = new AzureSqlContainerArgs();
        }

        public Builder(AzureSqlContainerArgs defaults) {
            $ = new AzureSqlContainerArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupManagementType(Either<String,BackupManagementType> backupManagementType) {
            return backupManagementType(Output.of(backupManagementType));
        }

        public Builder containerType(Output<String> containerType) {
            $.containerType = containerType;
            return this;
        }

        public Builder containerType(String containerType) {
            return containerType(Output.of(containerType));
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            $.healthStatus = healthStatus;
            return this;
        }

        public Builder healthStatus(String healthStatus) {
            return healthStatus(Output.of(healthStatus));
        }

        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            $.registrationStatus = registrationStatus;
            return this;
        }

        public Builder registrationStatus(String registrationStatus) {
            return registrationStatus(Output.of(registrationStatus));
        }

        public AzureSqlContainerArgs build() {
            $.containerType = Codegen.stringProp("containerType").output().arg($.containerType).require();
            return $;
        }
    }

}
