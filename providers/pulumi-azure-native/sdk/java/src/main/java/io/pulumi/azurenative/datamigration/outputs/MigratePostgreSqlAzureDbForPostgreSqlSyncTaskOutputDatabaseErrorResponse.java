// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.SyncMigrationDatabaseErrorEventResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse {
    /**
     * Error message
     * 
     */
    private final @Nullable String errorMessage;
    /**
     * List of error events.
     * 
     */
    private final @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Result type
     * Expected value is 'DatabaseLevelErrorOutput'.
     * 
     */
    private final String resultType;

    @OutputCustomType.Constructor
    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse(
        @OutputCustomType.Parameter("errorMessage") @Nullable String errorMessage,
        @OutputCustomType.Parameter("events") @Nullable List<SyncMigrationDatabaseErrorEventResponse> events,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("resultType") String resultType) {
        this.errorMessage = errorMessage;
        this.events = events;
        this.id = id;
        this.resultType = resultType;
    }

    /**
     * Error message
     * 
    */
    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    /**
     * List of error events.
     * 
    */
    public List<SyncMigrationDatabaseErrorEventResponse> getEvents() {
        return this.events == null ? List.of() : this.events;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Result type
     * Expected value is 'DatabaseLevelErrorOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.events = defaults.events;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder events(@Nullable List<SyncMigrationDatabaseErrorEventResponse> events) {
            this.events = events;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse(errorMessage, events, id, resultType);
        }
    }
}
