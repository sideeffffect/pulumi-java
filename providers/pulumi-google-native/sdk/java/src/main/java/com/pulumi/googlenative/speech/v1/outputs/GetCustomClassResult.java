// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.speech.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.speech.v1.outputs.ClassItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomClassResult {
    /**
     * @return If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
     * 
     */
    private final String customClassId;
    /**
     * @return A collection of class items.
     * 
     */
    private final List<ClassItemResponse> items;
    /**
     * @return The resource name of the custom class.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetCustomClassResult(
        @CustomType.Parameter("customClassId") String customClassId,
        @CustomType.Parameter("items") List<ClassItemResponse> items,
        @CustomType.Parameter("name") String name) {
        this.customClassId = customClassId;
        this.items = items;
        this.name = name;
    }

    /**
     * @return If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
     * 
     */
    public String customClassId() {
        return this.customClassId;
    }
    /**
     * @return A collection of class items.
     * 
     */
    public List<ClassItemResponse> items() {
        return this.items;
    }
    /**
     * @return The resource name of the custom class.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomClassResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customClassId;
        private List<ClassItemResponse> items;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomClassResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customClassId = defaults.customClassId;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
        }

        public Builder customClassId(String customClassId) {
            this.customClassId = Objects.requireNonNull(customClassId);
            return this;
        }
        public Builder items(List<ClassItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(ClassItemResponse... items) {
            return items(List.of(items));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetCustomClassResult build() {
            return new GetCustomClassResult(customClassId, items, name);
        }
    }
}
