// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.outputs;

import io.pulumi.aws.elasticbeanstalk.outputs.GetApplicationAppversionLifecycle;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetApplicationResult {
    private final GetApplicationAppversionLifecycle appversionLifecycle;
    /**
     * The Amazon Resource Name (ARN) of the application.
     * 
     */
    private final String arn;
    /**
     * Short description of the application
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;

    @OutputCustomType.Constructor({"appversionLifecycle","arn","description","id","name"})
    private GetApplicationResult(
        GetApplicationAppversionLifecycle appversionLifecycle,
        String arn,
        String description,
        String id,
        String name) {
        this.appversionLifecycle = appversionLifecycle;
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    public GetApplicationAppversionLifecycle getAppversionLifecycle() {
        return this.appversionLifecycle;
    }
    /**
     * The Amazon Resource Name (ARN) of the application.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Short description of the application
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationAppversionLifecycle appversionLifecycle;
        private String arn;
        private String description;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appversionLifecycle = defaults.appversionLifecycle;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setAppversionLifecycle(GetApplicationAppversionLifecycle appversionLifecycle) {
            this.appversionLifecycle = Objects.requireNonNull(appversionLifecycle);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetApplicationResult build() {
            return new GetApplicationResult(appversionLifecycle, arn, description, id, name);
        }
    }
}
