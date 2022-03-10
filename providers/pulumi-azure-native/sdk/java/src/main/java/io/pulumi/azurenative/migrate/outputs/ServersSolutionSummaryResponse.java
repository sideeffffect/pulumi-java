// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServersSolutionSummaryResponse {
    /**
     * Gets or sets the count of servers assessed.
     * 
     */
    private final @Nullable Integer assessedCount;
    /**
     * Gets or sets the count of servers discovered.
     * 
     */
    private final @Nullable Integer discoveredCount;
    /**
     * Gets the Instance type.
     * Expected value is 'Servers'.
     * 
     */
    private final String instanceType;
    /**
     * Gets or sets the count of servers migrated.
     * 
     */
    private final @Nullable Integer migratedCount;
    /**
     * Gets or sets the count of servers being replicated.
     * 
     */
    private final @Nullable Integer replicatingCount;
    /**
     * Gets or sets the count of servers test migrated.
     * 
     */
    private final @Nullable Integer testMigratedCount;

    @OutputCustomType.Constructor
    private ServersSolutionSummaryResponse(
        @OutputCustomType.Parameter("assessedCount") @Nullable Integer assessedCount,
        @OutputCustomType.Parameter("discoveredCount") @Nullable Integer discoveredCount,
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("migratedCount") @Nullable Integer migratedCount,
        @OutputCustomType.Parameter("replicatingCount") @Nullable Integer replicatingCount,
        @OutputCustomType.Parameter("testMigratedCount") @Nullable Integer testMigratedCount) {
        this.assessedCount = assessedCount;
        this.discoveredCount = discoveredCount;
        this.instanceType = instanceType;
        this.migratedCount = migratedCount;
        this.replicatingCount = replicatingCount;
        this.testMigratedCount = testMigratedCount;
    }

    /**
     * Gets or sets the count of servers assessed.
     * 
    */
    public Optional<Integer> getAssessedCount() {
        return Optional.ofNullable(this.assessedCount);
    }
    /**
     * Gets or sets the count of servers discovered.
     * 
    */
    public Optional<Integer> getDiscoveredCount() {
        return Optional.ofNullable(this.discoveredCount);
    }
    /**
     * Gets the Instance type.
     * Expected value is 'Servers'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets or sets the count of servers migrated.
     * 
    */
    public Optional<Integer> getMigratedCount() {
        return Optional.ofNullable(this.migratedCount);
    }
    /**
     * Gets or sets the count of servers being replicated.
     * 
    */
    public Optional<Integer> getReplicatingCount() {
        return Optional.ofNullable(this.replicatingCount);
    }
    /**
     * Gets or sets the count of servers test migrated.
     * 
    */
    public Optional<Integer> getTestMigratedCount() {
        return Optional.ofNullable(this.testMigratedCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServersSolutionSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assessedCount;
        private @Nullable Integer discoveredCount;
        private String instanceType;
        private @Nullable Integer migratedCount;
        private @Nullable Integer replicatingCount;
        private @Nullable Integer testMigratedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServersSolutionSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessedCount = defaults.assessedCount;
    	      this.discoveredCount = defaults.discoveredCount;
    	      this.instanceType = defaults.instanceType;
    	      this.migratedCount = defaults.migratedCount;
    	      this.replicatingCount = defaults.replicatingCount;
    	      this.testMigratedCount = defaults.testMigratedCount;
        }

        public Builder assessedCount(@Nullable Integer assessedCount) {
            this.assessedCount = assessedCount;
            return this;
        }

        public Builder discoveredCount(@Nullable Integer discoveredCount) {
            this.discoveredCount = discoveredCount;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder migratedCount(@Nullable Integer migratedCount) {
            this.migratedCount = migratedCount;
            return this;
        }

        public Builder replicatingCount(@Nullable Integer replicatingCount) {
            this.replicatingCount = replicatingCount;
            return this;
        }

        public Builder testMigratedCount(@Nullable Integer testMigratedCount) {
            this.testMigratedCount = testMigratedCount;
            return this;
        }
        public ServersSolutionSummaryResponse build() {
            return new ServersSolutionSummaryResponse(assessedCount, discoveredCount, instanceType, migratedCount, replicatingCount, testMigratedCount);
        }
    }
}
