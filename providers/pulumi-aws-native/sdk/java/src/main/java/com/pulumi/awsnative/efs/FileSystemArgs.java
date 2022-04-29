// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.efs;

import com.pulumi.awsnative.efs.inputs.FileSystemBackupPolicyArgs;
import com.pulumi.awsnative.efs.inputs.FileSystemElasticFileSystemTagArgs;
import com.pulumi.awsnative.efs.inputs.FileSystemLifecyclePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemArgs extends ResourceArgs {

    public static final FileSystemArgs Empty = new FileSystemArgs();

    @Import(name="availabilityZoneName")
    private @Nullable Output<String> availabilityZoneName;

    public Optional<Output<String>> availabilityZoneName() {
        return Optional.ofNullable(this.availabilityZoneName);
    }

    @Import(name="backupPolicy")
    private @Nullable Output<FileSystemBackupPolicyArgs> backupPolicy;

    public Optional<Output<FileSystemBackupPolicyArgs>> backupPolicy() {
        return Optional.ofNullable(this.backupPolicy);
    }

    /**
     * Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
     * 
     */
    @Import(name="bypassPolicyLockoutSafetyCheck")
    private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
     * 
     */
    public Optional<Output<Boolean>> bypassPolicyLockoutSafetyCheck() {
        return Optional.ofNullable(this.bypassPolicyLockoutSafetyCheck);
    }

    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    @Import(name="fileSystemPolicy")
    private @Nullable Output<Object> fileSystemPolicy;

    public Optional<Output<Object>> fileSystemPolicy() {
        return Optional.ofNullable(this.fileSystemPolicy);
    }

    @Import(name="fileSystemTags")
    private @Nullable Output<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags;

    public Optional<Output<List<FileSystemElasticFileSystemTagArgs>>> fileSystemTags() {
        return Optional.ofNullable(this.fileSystemTags);
    }

    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    @Import(name="lifecyclePolicies")
    private @Nullable Output<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies;

    public Optional<Output<List<FileSystemLifecyclePolicyArgs>>> lifecyclePolicies() {
        return Optional.ofNullable(this.lifecyclePolicies);
    }

    @Import(name="performanceMode")
    private @Nullable Output<String> performanceMode;

    public Optional<Output<String>> performanceMode() {
        return Optional.ofNullable(this.performanceMode);
    }

    @Import(name="provisionedThroughputInMibps")
    private @Nullable Output<Double> provisionedThroughputInMibps;

    public Optional<Output<Double>> provisionedThroughputInMibps() {
        return Optional.ofNullable(this.provisionedThroughputInMibps);
    }

    @Import(name="throughputMode")
    private @Nullable Output<String> throughputMode;

    public Optional<Output<String>> throughputMode() {
        return Optional.ofNullable(this.throughputMode);
    }

    private FileSystemArgs() {}

    private FileSystemArgs(FileSystemArgs $) {
        this.availabilityZoneName = $.availabilityZoneName;
        this.backupPolicy = $.backupPolicy;
        this.bypassPolicyLockoutSafetyCheck = $.bypassPolicyLockoutSafetyCheck;
        this.encrypted = $.encrypted;
        this.fileSystemPolicy = $.fileSystemPolicy;
        this.fileSystemTags = $.fileSystemTags;
        this.kmsKeyId = $.kmsKeyId;
        this.lifecyclePolicies = $.lifecyclePolicies;
        this.performanceMode = $.performanceMode;
        this.provisionedThroughputInMibps = $.provisionedThroughputInMibps;
        this.throughputMode = $.throughputMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemArgs $;

        public Builder() {
            $ = new FileSystemArgs();
        }

        public Builder(FileSystemArgs defaults) {
            $ = new FileSystemArgs(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZoneName(@Nullable Output<String> availabilityZoneName) {
            $.availabilityZoneName = availabilityZoneName;
            return this;
        }

        public Builder availabilityZoneName(String availabilityZoneName) {
            return availabilityZoneName(Output.of(availabilityZoneName));
        }

        public Builder backupPolicy(@Nullable Output<FileSystemBackupPolicyArgs> backupPolicy) {
            $.backupPolicy = backupPolicy;
            return this;
        }

        public Builder backupPolicy(FileSystemBackupPolicyArgs backupPolicy) {
            return backupPolicy(Output.of(backupPolicy));
        }

        /**
         * @param bypassPolicyLockoutSafetyCheck Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
         * 
         * @return builder
         * 
         */
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            $.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }

        /**
         * @param bypassPolicyLockoutSafetyCheck Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
         * 
         * @return builder
         * 
         */
        public Builder bypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
            return bypassPolicyLockoutSafetyCheck(Output.of(bypassPolicyLockoutSafetyCheck));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        public Builder fileSystemPolicy(@Nullable Output<Object> fileSystemPolicy) {
            $.fileSystemPolicy = fileSystemPolicy;
            return this;
        }

        public Builder fileSystemPolicy(Object fileSystemPolicy) {
            return fileSystemPolicy(Output.of(fileSystemPolicy));
        }

        public Builder fileSystemTags(@Nullable Output<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags) {
            $.fileSystemTags = fileSystemTags;
            return this;
        }

        public Builder fileSystemTags(List<FileSystemElasticFileSystemTagArgs> fileSystemTags) {
            return fileSystemTags(Output.of(fileSystemTags));
        }

        public Builder fileSystemTags(FileSystemElasticFileSystemTagArgs... fileSystemTags) {
            return fileSystemTags(List.of(fileSystemTags));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder lifecyclePolicies(@Nullable Output<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies) {
            $.lifecyclePolicies = lifecyclePolicies;
            return this;
        }

        public Builder lifecyclePolicies(List<FileSystemLifecyclePolicyArgs> lifecyclePolicies) {
            return lifecyclePolicies(Output.of(lifecyclePolicies));
        }

        public Builder lifecyclePolicies(FileSystemLifecyclePolicyArgs... lifecyclePolicies) {
            return lifecyclePolicies(List.of(lifecyclePolicies));
        }

        public Builder performanceMode(@Nullable Output<String> performanceMode) {
            $.performanceMode = performanceMode;
            return this;
        }

        public Builder performanceMode(String performanceMode) {
            return performanceMode(Output.of(performanceMode));
        }

        public Builder provisionedThroughputInMibps(@Nullable Output<Double> provisionedThroughputInMibps) {
            $.provisionedThroughputInMibps = provisionedThroughputInMibps;
            return this;
        }

        public Builder provisionedThroughputInMibps(Double provisionedThroughputInMibps) {
            return provisionedThroughputInMibps(Output.of(provisionedThroughputInMibps));
        }

        public Builder throughputMode(@Nullable Output<String> throughputMode) {
            $.throughputMode = throughputMode;
            return this;
        }

        public Builder throughputMode(String throughputMode) {
            return throughputMode(Output.of(throughputMode));
        }

        public FileSystemArgs build() {
            return $;
        }
    }

}
