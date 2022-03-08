// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.JobS3Location;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobDatabaseTableOutputOptions {
    private final String tableName;
    private final @Nullable JobS3Location tempDirectory;

    @OutputCustomType.Constructor({"tableName","tempDirectory"})
    private JobDatabaseTableOutputOptions(
        String tableName,
        @Nullable JobS3Location tempDirectory) {
        this.tableName = tableName;
        this.tempDirectory = tempDirectory;
    }

    public String getTableName() {
        return this.tableName;
    }
    public Optional<JobS3Location> getTempDirectory() {
        return Optional.ofNullable(this.tempDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDatabaseTableOutputOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableName;
        private @Nullable JobS3Location tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDatabaseTableOutputOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTempDirectory(@Nullable JobS3Location tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }
        public JobDatabaseTableOutputOptions build() {
            return new JobDatabaseTableOutputOptions(tableName, tempDirectory);
        }
    }
}
