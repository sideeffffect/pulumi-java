// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetImageImageTestsConfiguration;
import io.pulumi.aws.imagebuilder.outputs.GetImageOutputResource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetImageResult {
    private final String arn;
    /**
     * Build version Amazon Resource Name (ARN) of the image. This will always have the `#.#.#/#` suffix.
     * 
     */
    private final String buildVersionArn;
    /**
     * Date the image was created.
     * 
     */
    private final String dateCreated;
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    private final String distributionConfigurationArn;
    /**
     * Whether additional information about the image being created is collected.
     * 
     */
    private final Boolean enhancedImageMetadataEnabled;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    private final String imageRecipeArn;
    /**
     * List of an object with image tests configuration.
     * 
     */
    private final List<GetImageImageTestsConfiguration> imageTestsConfigurations;
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    private final String infrastructureConfigurationArn;
    /**
     * Name of the AMI.
     * 
     */
    private final String name;
    /**
     * Operating System version of the image.
     * 
     */
    private final String osVersion;
    /**
     * List of objects with resources created by the image.
     * 
     */
    private final List<GetImageOutputResource> outputResources;
    /**
     * Platform of the image.
     * 
     */
    private final String platform;
    /**
     * Key-value map of resource tags for the image.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Version of the image.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"arn","buildVersionArn","dateCreated","distributionConfigurationArn","enhancedImageMetadataEnabled","id","imageRecipeArn","imageTestsConfigurations","infrastructureConfigurationArn","name","osVersion","outputResources","platform","tags","version"})
    private GetImageResult(
        String arn,
        String buildVersionArn,
        String dateCreated,
        String distributionConfigurationArn,
        Boolean enhancedImageMetadataEnabled,
        String id,
        String imageRecipeArn,
        List<GetImageImageTestsConfiguration> imageTestsConfigurations,
        String infrastructureConfigurationArn,
        String name,
        String osVersion,
        List<GetImageOutputResource> outputResources,
        String platform,
        Map<String,String> tags,
        String version) {
        this.arn = arn;
        this.buildVersionArn = buildVersionArn;
        this.dateCreated = dateCreated;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.id = id;
        this.imageRecipeArn = imageRecipeArn;
        this.imageTestsConfigurations = imageTestsConfigurations;
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        this.name = name;
        this.osVersion = osVersion;
        this.outputResources = outputResources;
        this.platform = platform;
        this.tags = tags;
        this.version = version;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * Build version Amazon Resource Name (ARN) of the image. This will always have the `#.#.#/#` suffix.
     * 
    */
    public String getBuildVersionArn() {
        return this.buildVersionArn;
    }
    /**
     * Date the image was created.
     * 
    */
    public String getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
    */
    public String getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * Whether additional information about the image being created is collected.
     * 
    */
    public Boolean getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
    */
    public String getImageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * List of an object with image tests configuration.
     * 
    */
    public List<GetImageImageTestsConfiguration> getImageTestsConfigurations() {
        return this.imageTestsConfigurations;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
    */
    public String getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * Name of the AMI.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Operating System version of the image.
     * 
    */
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * List of objects with resources created by the image.
     * 
    */
    public List<GetImageOutputResource> getOutputResources() {
        return this.outputResources;
    }
    /**
     * Platform of the image.
     * 
    */
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Key-value map of resource tags for the image.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Version of the image.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String buildVersionArn;
        private String dateCreated;
        private String distributionConfigurationArn;
        private Boolean enhancedImageMetadataEnabled;
        private String id;
        private String imageRecipeArn;
        private List<GetImageImageTestsConfiguration> imageTestsConfigurations;
        private String infrastructureConfigurationArn;
        private String name;
        private String osVersion;
        private List<GetImageOutputResource> outputResources;
        private String platform;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.buildVersionArn = defaults.buildVersionArn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.id = defaults.id;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfigurations = defaults.imageTestsConfigurations;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.osVersion = defaults.osVersion;
    	      this.outputResources = defaults.outputResources;
    	      this.platform = defaults.platform;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setBuildVersionArn(String buildVersionArn) {
            this.buildVersionArn = Objects.requireNonNull(buildVersionArn);
            return this;
        }

        public Builder setDateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }

        public Builder setDistributionConfigurationArn(String distributionConfigurationArn) {
            this.distributionConfigurationArn = Objects.requireNonNull(distributionConfigurationArn);
            return this;
        }

        public Builder setEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Objects.requireNonNull(enhancedImageMetadataEnabled);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageRecipeArn(String imageRecipeArn) {
            this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn);
            return this;
        }

        public Builder setImageTestsConfigurations(List<GetImageImageTestsConfiguration> imageTestsConfigurations) {
            this.imageTestsConfigurations = Objects.requireNonNull(imageTestsConfigurations);
            return this;
        }

        public Builder setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }

        public Builder setOutputResources(List<GetImageOutputResource> outputResources) {
            this.outputResources = Objects.requireNonNull(outputResources);
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetImageResult build() {
            return new GetImageResult(arn, buildVersionArn, dateCreated, distributionConfigurationArn, enhancedImageMetadataEnabled, id, imageRecipeArn, imageTestsConfigurations, infrastructureConfigurationArn, name, osVersion, outputResources, platform, tags, version);
        }
    }
}
