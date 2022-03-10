// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListNotebookKeysResultResponse {
    private final String primaryAccessKey;
    private final String secondaryAccessKey;

    @OutputCustomType.Constructor
    private ListNotebookKeysResultResponse(
        @OutputCustomType.Parameter("primaryAccessKey") String primaryAccessKey,
        @OutputCustomType.Parameter("secondaryAccessKey") String secondaryAccessKey) {
        this.primaryAccessKey = primaryAccessKey;
        this.secondaryAccessKey = secondaryAccessKey;
    }

    public String getPrimaryAccessKey() {
        return this.primaryAccessKey;
    }
    public String getSecondaryAccessKey() {
        return this.secondaryAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNotebookKeysResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryAccessKey;
        private String secondaryAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNotebookKeysResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryAccessKey = defaults.primaryAccessKey;
    	      this.secondaryAccessKey = defaults.secondaryAccessKey;
        }

        public Builder primaryAccessKey(String primaryAccessKey) {
            this.primaryAccessKey = Objects.requireNonNull(primaryAccessKey);
            return this;
        }

        public Builder secondaryAccessKey(String secondaryAccessKey) {
            this.secondaryAccessKey = Objects.requireNonNull(secondaryAccessKey);
            return this;
        }
        public ListNotebookKeysResultResponse build() {
            return new ListNotebookKeysResultResponse(primaryAccessKey, secondaryAccessKey);
        }
    }
}
