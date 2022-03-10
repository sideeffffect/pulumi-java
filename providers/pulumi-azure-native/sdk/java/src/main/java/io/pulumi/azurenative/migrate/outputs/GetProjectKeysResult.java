// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetProjectKeysResult {
    /**
     * ID of Migration Project.
     * 
     */
    private final String workspaceId;
    /**
     * Key of Migration Project.
     * 
     */
    private final String workspaceKey;

    @OutputCustomType.Constructor
    private GetProjectKeysResult(
        @OutputCustomType.Parameter("workspaceId") String workspaceId,
        @OutputCustomType.Parameter("workspaceKey") String workspaceKey) {
        this.workspaceId = workspaceId;
        this.workspaceKey = workspaceKey;
    }

    /**
     * ID of Migration Project.
     * 
    */
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    /**
     * Key of Migration Project.
     * 
    */
    public String getWorkspaceKey() {
        return this.workspaceKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String workspaceId;
        private String workspaceKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceKey = defaults.workspaceKey;
        }

        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder workspaceKey(String workspaceKey) {
            this.workspaceKey = Objects.requireNonNull(workspaceKey);
            return this;
        }
        public GetProjectKeysResult build() {
            return new GetProjectKeysResult(workspaceId, workspaceKey);
        }
    }
}
