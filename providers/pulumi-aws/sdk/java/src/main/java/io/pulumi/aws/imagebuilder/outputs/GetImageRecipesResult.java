// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetImageRecipesFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetImageRecipesResult {
    /**
     * Set of ARNs of the matched Image Builder Image Recipes.
     * 
     */
    private final List<String> arns;
    private final @Nullable List<GetImageRecipesFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of names of the matched Image Builder Image Recipes.
     * 
     */
    private final List<String> names;
    private final @Nullable String owner;

    @OutputCustomType.Constructor({"arns","filters","id","names","owner"})
    private GetImageRecipesResult(
        List<String> arns,
        @Nullable List<GetImageRecipesFilter> filters,
        String id,
        List<String> names,
        @Nullable String owner) {
        this.arns = arns;
        this.filters = filters;
        this.id = id;
        this.names = names;
        this.owner = owner;
    }

    /**
     * Set of ARNs of the matched Image Builder Image Recipes.
     * 
    */
    public List<String> getArns() {
        return this.arns;
    }
    public List<GetImageRecipesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of names of the matched Image Builder Image Recipes.
     * 
    */
    public List<String> getNames() {
        return this.names;
    }
    public Optional<String> getOwner() {
        return Optional.ofNullable(this.owner);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetImageRecipesFilter> filters;
        private String id;
        private List<String> names;
        private @Nullable String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.owner = defaults.owner;
        }

        public Builder setArns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder setFilters(@Nullable List<GetImageRecipesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public GetImageRecipesResult build() {
            return new GetImageRecipesResult(arns, filters, id, names, owner);
        }
    }
}
