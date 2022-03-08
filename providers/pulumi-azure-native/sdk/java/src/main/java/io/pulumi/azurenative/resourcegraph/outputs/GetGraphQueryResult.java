// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourcegraph.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGraphQueryResult {
    /**
     * The description of a graph query.
     * 
     */
    private final @Nullable String description;
    /**
     * This will be used to handle Optimistic Concurrency. If not present, it will always overwrite the existing resource without checking conflict.
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The location of the resource
     * 
     */
    private final @Nullable String location;
    /**
     * Azure resource name. This is GUID value. The display name should be assigned within properties field.
     * 
     */
    private final String name;
    /**
     * KQL query that will be graph.
     * 
     */
    private final String query;
    /**
     * Enum indicating a type of graph query.
     * 
     */
    private final String resultKind;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Date and time in UTC of the last modification that was made to this graph query definition.
     * 
     */
    private final String timeModified;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","etag","id","location","name","query","resultKind","tags","timeModified","type"})
    private GetGraphQueryResult(
        @Nullable String description,
        @Nullable String etag,
        String id,
        @Nullable String location,
        String name,
        String query,
        String resultKind,
        @Nullable Map<String,String> tags,
        String timeModified,
        String type) {
        this.description = description;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.query = query;
        this.resultKind = resultKind;
        this.tags = tags;
        this.timeModified = timeModified;
        this.type = type;
    }

    /**
     * The description of a graph query.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * This will be used to handle Optimistic Concurrency. If not present, it will always overwrite the existing resource without checking conflict.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Azure resource name. This is GUID value. The display name should be assigned within properties field.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * KQL query that will be graph.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * Enum indicating a type of graph query.
     * 
    */
    public String getResultKind() {
        return this.resultKind;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Date and time in UTC of the last modification that was made to this graph query definition.
     * 
    */
    public String getTimeModified() {
        return this.timeModified;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGraphQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String query;
        private String resultKind;
        private @Nullable Map<String,String> tags;
        private String timeModified;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGraphQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.resultKind = defaults.resultKind;
    	      this.tags = defaults.tags;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setResultKind(String resultKind) {
            this.resultKind = Objects.requireNonNull(resultKind);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGraphQueryResult build() {
            return new GetGraphQueryResult(description, etag, id, location, name, query, resultKind, tags, timeModified, type);
        }
    }
}
