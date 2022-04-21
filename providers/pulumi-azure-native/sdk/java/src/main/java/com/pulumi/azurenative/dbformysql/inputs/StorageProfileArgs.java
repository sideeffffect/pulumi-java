// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql.inputs;

import com.pulumi.azurenative.dbformysql.enums.GeoRedundantBackup;
import com.pulumi.azurenative.dbformysql.enums.StorageAutogrow;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage Profile properties of a server
 * 
 */
public final class StorageProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Backup retention days for the server.
     * 
     */
    @Import(name="backupRetentionDays")
    private @Nullable Output<Integer> backupRetentionDays;

    public Optional<Output<Integer>> backupRetentionDays() {
        return Optional.ofNullable(this.backupRetentionDays);
    }

    /**
     * Enable Geo-redundant or not for server backup.
     * 
     */
    @Import(name="geoRedundantBackup")
    private @Nullable Output<Either<String,GeoRedundantBackup>> geoRedundantBackup;

    public Optional<Output<Either<String,GeoRedundantBackup>>> geoRedundantBackup() {
        return Optional.ofNullable(this.geoRedundantBackup);
    }

    /**
     * Enable Storage Auto Grow.
     * 
     */
    @Import(name="storageAutogrow")
    private @Nullable Output<Either<String,StorageAutogrow>> storageAutogrow;

    public Optional<Output<Either<String,StorageAutogrow>>> storageAutogrow() {
        return Optional.ofNullable(this.storageAutogrow);
    }

    /**
     * Max storage allowed for a server.
     * 
     */
    @Import(name="storageMB")
    private @Nullable Output<Integer> storageMB;

    public Optional<Output<Integer>> storageMB() {
        return Optional.ofNullable(this.storageMB);
    }

    private StorageProfileArgs() {}

    private StorageProfileArgs(StorageProfileArgs $) {
        this.backupRetentionDays = $.backupRetentionDays;
        this.geoRedundantBackup = $.geoRedundantBackup;
        this.storageAutogrow = $.storageAutogrow;
        this.storageMB = $.storageMB;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageProfileArgs $;

        public Builder() {
            $ = new StorageProfileArgs();
        }

        public Builder(StorageProfileArgs defaults) {
            $ = new StorageProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupRetentionDays(@Nullable Output<Integer> backupRetentionDays) {
            $.backupRetentionDays = backupRetentionDays;
            return this;
        }

        public Builder backupRetentionDays(Integer backupRetentionDays) {
            return backupRetentionDays(Output.of(backupRetentionDays));
        }

        public Builder geoRedundantBackup(@Nullable Output<Either<String,GeoRedundantBackup>> geoRedundantBackup) {
            $.geoRedundantBackup = geoRedundantBackup;
            return this;
        }

        public Builder geoRedundantBackup(Either<String,GeoRedundantBackup> geoRedundantBackup) {
            return geoRedundantBackup(Output.of(geoRedundantBackup));
        }

        public Builder storageAutogrow(@Nullable Output<Either<String,StorageAutogrow>> storageAutogrow) {
            $.storageAutogrow = storageAutogrow;
            return this;
        }

        public Builder storageAutogrow(Either<String,StorageAutogrow> storageAutogrow) {
            return storageAutogrow(Output.of(storageAutogrow));
        }

        public Builder storageMB(@Nullable Output<Integer> storageMB) {
            $.storageMB = storageMB;
            return this;
        }

        public Builder storageMB(Integer storageMB) {
            return storageMB(Output.of(storageMB));
        }

        public StorageProfileArgs build() {
            return $;
        }
    }

}
