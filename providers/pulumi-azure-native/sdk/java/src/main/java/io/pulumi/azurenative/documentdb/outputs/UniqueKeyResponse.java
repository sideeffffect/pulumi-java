// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class UniqueKeyResponse {
    /**
     * List of paths must be unique for each document in the Azure Cosmos DB service
     * 
     */
    private final @Nullable List<String> paths;

    @OutputCustomType.Constructor
    private UniqueKeyResponse(@OutputCustomType.Parameter("paths") @Nullable List<String> paths) {
        this.paths = paths;
    }

    /**
     * List of paths must be unique for each document in the Azure Cosmos DB service
     * 
    */
    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniqueKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(UniqueKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder paths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }
        public UniqueKeyResponse build() {
            return new UniqueKeyResponse(paths);
        }
    }
}
