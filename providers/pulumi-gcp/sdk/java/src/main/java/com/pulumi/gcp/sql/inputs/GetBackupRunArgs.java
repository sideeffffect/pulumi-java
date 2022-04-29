// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupRunArgs extends InvokeArgs {

    public static final GetBackupRunArgs Empty = new GetBackupRunArgs();

    /**
     * The identifier for this backup run. Unique only for a specific Cloud SQL instance.
     * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
     * 
     */
    @Import(name="backupId")
    private @Nullable Integer backupId;

    /**
     * @return The identifier for this backup run. Unique only for a specific Cloud SQL instance.
     * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
     * 
     */
    public Optional<Integer> backupId() {
        return Optional.ofNullable(this.backupId);
    }

    /**
     * The name of the instance the backup is taken from.
     * 
     */
    @Import(name="instance", required=true)
    private String instance;

    /**
     * @return The name of the instance the backup is taken from.
     * 
     */
    public String instance() {
        return this.instance;
    }

    /**
     * Toggles use of the most recent backup run if multiple backups exist for a
     * Cloud SQL instance.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return Toggles use of the most recent backup run if multiple backups exist for a
     * Cloud SQL instance.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    private GetBackupRunArgs() {}

    private GetBackupRunArgs(GetBackupRunArgs $) {
        this.backupId = $.backupId;
        this.instance = $.instance;
        this.mostRecent = $.mostRecent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupRunArgs $;

        public Builder() {
            $ = new GetBackupRunArgs();
        }

        public Builder(GetBackupRunArgs defaults) {
            $ = new GetBackupRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId The identifier for this backup run. Unique only for a specific Cloud SQL instance.
         * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder backupId(@Nullable Integer backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param instance The name of the instance the backup is taken from.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param mostRecent Toggles use of the most recent backup run if multiple backups exist for a
         * Cloud SQL instance.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        public GetBackupRunArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            return $;
        }
    }

}
