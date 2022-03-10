// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.IndexingPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlContainerGetPropertiesResponseResource {
    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    private final @Nullable IndexingPolicyResponse indexingPolicy;

    @OutputCustomType.Constructor
    private SqlContainerGetPropertiesResponseResource(@OutputCustomType.Parameter("indexingPolicy") @Nullable IndexingPolicyResponse indexingPolicy) {
        this.indexingPolicy = indexingPolicy;
    }

    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
    */
    public Optional<IndexingPolicyResponse> getIndexingPolicy() {
        return Optional.ofNullable(this.indexingPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IndexingPolicyResponse indexingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexingPolicy = defaults.indexingPolicy;
        }

        public Builder indexingPolicy(@Nullable IndexingPolicyResponse indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }
        public SqlContainerGetPropertiesResponseResource build() {
            return new SqlContainerGetPropertiesResponseResource(indexingPolicy);
        }
    }
}
