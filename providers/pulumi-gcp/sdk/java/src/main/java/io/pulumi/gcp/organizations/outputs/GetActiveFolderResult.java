// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetActiveFolderResult {
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The resource name of the Folder. This uniquely identifies the folder.
     * 
     */
    private final String name;
    private final String parent;

    @OutputCustomType.Constructor
    private GetActiveFolderResult(
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parent") String parent) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name of the Folder. This uniquely identifies the folder.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getParent() {
        return this.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActiveFolderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String name;
        private String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActiveFolderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public GetActiveFolderResult build() {
            return new GetActiveFolderResult(displayName, id, name, parent);
        }
    }
}
