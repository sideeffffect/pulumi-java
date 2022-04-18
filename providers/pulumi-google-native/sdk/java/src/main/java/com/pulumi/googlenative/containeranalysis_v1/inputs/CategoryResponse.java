// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The category to which the update belongs.
 * 
 */
public final class CategoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final CategoryResponse Empty = new CategoryResponse();

    /**
     * The identifier of the category.
     * 
     */
    @Import(name="categoryId", required=true)
      private final String categoryId;

    public String categoryId() {
        return this.categoryId;
    }

    /**
     * The localized name of the category.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public CategoryResponse(
        String categoryId,
        String name) {
        this.categoryId = Objects.requireNonNull(categoryId, "expected parameter 'categoryId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private CategoryResponse() {
        this.categoryId = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CategoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String categoryId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CategoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryId = defaults.categoryId;
    	      this.name = defaults.name;
        }

        public Builder categoryId(String categoryId) {
            this.categoryId = Objects.requireNonNull(categoryId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public CategoryResponse build() {
            return new CategoryResponse(categoryId, name);
        }
    }
}
