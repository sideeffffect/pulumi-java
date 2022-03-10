// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApisResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of API identifiers.
     * 
     */
    private final List<String> ids;
    private final @Nullable String name;
    private final @Nullable String protocolType;
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetApisResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ids") List<String> ids,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("protocolType") @Nullable String protocolType,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.id = id;
        this.ids = ids;
        this.name = name;
        this.protocolType = protocolType;
        this.tags = tags;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of API identifiers.
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getProtocolType() {
        return Optional.ofNullable(this.protocolType);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApisResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String name;
        private @Nullable String protocolType;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApisResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.name = defaults.name;
    	      this.protocolType = defaults.protocolType;
    	      this.tags = defaults.tags;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder protocolType(@Nullable String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetApisResult build() {
            return new GetApisResult(id, ids, name, protocolType, tags);
        }
    }
}
