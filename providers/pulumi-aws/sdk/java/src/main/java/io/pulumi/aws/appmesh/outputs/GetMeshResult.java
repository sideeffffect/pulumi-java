// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GetMeshSpec;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetMeshResult {
    /**
     * The ARN of the service mesh.
     * 
     */
    private final String arn;
    /**
     * The creation date of the service mesh.
     * 
     */
    private final String createdDate;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The last update date of the service mesh.
     * 
     */
    private final String lastUpdatedDate;
    private final String meshOwner;
    private final String name;
    /**
     * The resource owner's AWS account ID.
     * 
     */
    private final String resourceOwner;
    /**
     * The service mesh specification.
     * 
     */
    private final List<GetMeshSpec> specs;
    /**
     * A map of tags.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetMeshResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("createdDate") String createdDate,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("lastUpdatedDate") String lastUpdatedDate,
        @OutputCustomType.Parameter("meshOwner") String meshOwner,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("resourceOwner") String resourceOwner,
        @OutputCustomType.Parameter("specs") List<GetMeshSpec> specs,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.createdDate = createdDate;
        this.id = id;
        this.lastUpdatedDate = lastUpdatedDate;
        this.meshOwner = meshOwner;
        this.name = name;
        this.resourceOwner = resourceOwner;
        this.specs = specs;
        this.tags = tags;
    }

    /**
     * The ARN of the service mesh.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The creation date of the service mesh.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last update date of the service mesh.
     * 
    */
    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    public String getMeshOwner() {
        return this.meshOwner;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The resource owner's AWS account ID.
     * 
    */
    public String getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The service mesh specification.
     * 
    */
    public List<GetMeshSpec> getSpecs() {
        return this.specs;
    }
    /**
     * A map of tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String createdDate;
        private String id;
        private String lastUpdatedDate;
        private String meshOwner;
        private String name;
        private String resourceOwner;
        private List<GetMeshSpec> specs;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.specs = defaults.specs;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder lastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
            return this;
        }

        public Builder meshOwner(String meshOwner) {
            this.meshOwner = Objects.requireNonNull(meshOwner);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceOwner(String resourceOwner) {
            this.resourceOwner = Objects.requireNonNull(resourceOwner);
            return this;
        }

        public Builder specs(List<GetMeshSpec> specs) {
            this.specs = Objects.requireNonNull(specs);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetMeshResult build() {
            return new GetMeshResult(arn, createdDate, id, lastUpdatedDate, meshOwner, name, resourceOwner, specs, tags);
        }
    }
}
