// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.EntityReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PackageStoreResponse {
    /**
     * The name of the package store
     * 
     */
    private final String name;
    /**
     * The package store linked service reference.
     * 
     */
    private final EntityReferenceResponse packageStoreLinkedService;

    @OutputCustomType.Constructor
    private PackageStoreResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("packageStoreLinkedService") EntityReferenceResponse packageStoreLinkedService) {
        this.name = name;
        this.packageStoreLinkedService = packageStoreLinkedService;
    }

    /**
     * The name of the package store
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The package store linked service reference.
     * 
    */
    public EntityReferenceResponse getPackageStoreLinkedService() {
        return this.packageStoreLinkedService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private EntityReferenceResponse packageStoreLinkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.packageStoreLinkedService = defaults.packageStoreLinkedService;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder packageStoreLinkedService(EntityReferenceResponse packageStoreLinkedService) {
            this.packageStoreLinkedService = Objects.requireNonNull(packageStoreLinkedService);
            return this;
        }
        public PackageStoreResponse build() {
            return new PackageStoreResponse(name, packageStoreLinkedService);
        }
    }
}
