// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListStaticSiteConfiguredRolesResult {
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * List of string resources.
     * 
     */
    private final List<String> properties;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","properties","type"})
    private ListStaticSiteConfiguredRolesResult(
        String id,
        @Nullable String kind,
        String name,
        List<String> properties,
        String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of string resources.
     * 
    */
    public List<String> getProperties() {
        return this.properties;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStaticSiteConfiguredRolesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private List<String> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStaticSiteConfiguredRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(List<String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListStaticSiteConfiguredRolesResult build() {
            return new ListStaticSiteConfiguredRolesResult(id, kind, name, properties, type);
        }
    }
}
