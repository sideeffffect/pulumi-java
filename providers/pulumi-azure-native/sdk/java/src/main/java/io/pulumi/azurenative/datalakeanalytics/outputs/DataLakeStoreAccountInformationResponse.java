// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataLakeStoreAccountInformationResponse {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The optional suffix for the Data Lake Store account.
     * 
     */
    private final String suffix;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","suffix","type"})
    private DataLakeStoreAccountInformationResponse(
        String id,
        String name,
        String suffix,
        String type) {
        this.id = id;
        this.name = name;
        this.suffix = suffix;
        this.type = type;
    }

    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The optional suffix for the Data Lake Store account.
     * 
    */
    public String getSuffix() {
        return this.suffix;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeStoreAccountInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String suffix;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeStoreAccountInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.suffix = defaults.suffix;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSuffix(String suffix) {
            this.suffix = Objects.requireNonNull(suffix);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DataLakeStoreAccountInformationResponse build() {
            return new DataLakeStoreAccountInformationResponse(id, name, suffix, type);
        }
    }
}
