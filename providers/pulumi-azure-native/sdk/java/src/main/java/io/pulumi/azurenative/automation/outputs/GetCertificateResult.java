// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateResult {
    /**
     * Gets the creation time.
     * 
     */
    private final String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets the expiry time of the certificate.
     * 
     */
    private final String expiryTime;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets the is exportable flag of the certificate.
     * 
     */
    private final Boolean isExportable;
    /**
     * Gets the last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets the thumbprint of the certificate.
     * 
     */
    private final String thumbprint;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"creationTime","description","expiryTime","id","isExportable","lastModifiedTime","name","thumbprint","type"})
    private GetCertificateResult(
        String creationTime,
        @Nullable String description,
        String expiryTime,
        String id,
        Boolean isExportable,
        String lastModifiedTime,
        String name,
        String thumbprint,
        String type) {
        this.creationTime = creationTime;
        this.description = description;
        this.expiryTime = expiryTime;
        this.id = id;
        this.isExportable = isExportable;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.thumbprint = thumbprint;
        this.type = type;
    }

    /**
     * Gets the creation time.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets the expiry time of the certificate.
     * 
    */
    public String getExpiryTime() {
        return this.expiryTime;
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets the is exportable flag of the certificate.
     * 
    */
    public Boolean getIsExportable() {
        return this.isExportable;
    }
    /**
     * Gets the last modified time.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the thumbprint of the certificate.
     * 
    */
    public String getThumbprint() {
        return this.thumbprint;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable String description;
        private String expiryTime;
        private String id;
        private Boolean isExportable;
        private String lastModifiedTime;
        private String name;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.id = defaults.id;
    	      this.isExportable = defaults.isExportable;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpiryTime(String expiryTime) {
            this.expiryTime = Objects.requireNonNull(expiryTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsExportable(Boolean isExportable) {
            this.isExportable = Objects.requireNonNull(isExportable);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCertificateResult build() {
            return new GetCertificateResult(creationTime, description, expiryTime, id, isExportable, lastModifiedTime, name, thumbprint, type);
        }
    }
}
