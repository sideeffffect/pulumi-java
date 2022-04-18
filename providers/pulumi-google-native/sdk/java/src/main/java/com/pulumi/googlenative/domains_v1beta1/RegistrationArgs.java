// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.domains_v1beta1.enums.RegistrationContactNoticesItem;
import com.pulumi.googlenative.domains_v1beta1.enums.RegistrationDomainNoticesItem;
import com.pulumi.googlenative.domains_v1beta1.inputs.ContactSettingsArgs;
import com.pulumi.googlenative.domains_v1beta1.inputs.DnsSettingsArgs;
import com.pulumi.googlenative.domains_v1beta1.inputs.ManagementSettingsArgs;
import com.pulumi.googlenative.domains_v1beta1.inputs.MoneyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistrationArgs Empty = new RegistrationArgs();

    /**
     * The list of contact notices that the caller acknowledges. The notices needed here depend on the values specified in `registration.contact_settings`.
     * 
     */
    @Import(name="contactNotices")
      private final @Nullable Output<List<RegistrationContactNoticesItem>> contactNotices;

    public Output<List<RegistrationContactNoticesItem>> contactNotices() {
        return this.contactNotices == null ? Codegen.empty() : this.contactNotices;
    }

    /**
     * Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    @Import(name="contactSettings", required=true)
      private final Output<ContactSettingsArgs> contactSettings;

    public Output<ContactSettingsArgs> contactSettings() {
        return this.contactSettings;
    }

    /**
     * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    @Import(name="dnsSettings")
      private final @Nullable Output<DnsSettingsArgs> dnsSettings;

    public Output<DnsSettingsArgs> dnsSettings() {
        return this.dnsSettings == null ? Codegen.empty() : this.dnsSettings;
    }

    /**
     * Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The list of domain notices that you acknowledge. Call `RetrieveRegisterParameters` to see the notices that need acknowledgement.
     * 
     */
    @Import(name="domainNotices")
      private final @Nullable Output<List<RegistrationDomainNoticesItem>> domainNotices;

    public Output<List<RegistrationDomainNoticesItem>> domainNotices() {
        return this.domainNotices == null ? Codegen.empty() : this.domainNotices;
    }

    /**
     * Set of labels associated with the `Registration`.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    @Import(name="managementSettings")
      private final @Nullable Output<ManagementSettingsArgs> managementSettings;

    public Output<ManagementSettingsArgs> managementSettings() {
        return this.managementSettings == null ? Codegen.empty() : this.managementSettings;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * When true, only validation is performed, without actually registering the domain. Follows: https://cloud.google.com/apis/design/design_patterns#request_validation
     * 
     */
    @Import(name="validateOnly")
      private final @Nullable Output<Boolean> validateOnly;

    public Output<Boolean> validateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    /**
     * Yearly price to register or renew the domain. The value that should be put here can be obtained from RetrieveRegisterParameters or SearchDomains calls.
     * 
     */
    @Import(name="yearlyPrice", required=true)
      private final Output<MoneyArgs> yearlyPrice;

    public Output<MoneyArgs> yearlyPrice() {
        return this.yearlyPrice;
    }

    public RegistrationArgs(
        @Nullable Output<List<RegistrationContactNoticesItem>> contactNotices,
        Output<ContactSettingsArgs> contactSettings,
        @Nullable Output<DnsSettingsArgs> dnsSettings,
        Output<String> domainName,
        @Nullable Output<List<RegistrationDomainNoticesItem>> domainNotices,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<ManagementSettingsArgs> managementSettings,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> validateOnly,
        Output<MoneyArgs> yearlyPrice) {
        this.contactNotices = contactNotices;
        this.contactSettings = Objects.requireNonNull(contactSettings, "expected parameter 'contactSettings' to be non-null");
        this.dnsSettings = dnsSettings;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainNotices = domainNotices;
        this.labels = labels;
        this.location = location;
        this.managementSettings = managementSettings;
        this.project = project;
        this.validateOnly = validateOnly;
        this.yearlyPrice = Objects.requireNonNull(yearlyPrice, "expected parameter 'yearlyPrice' to be non-null");
    }

    private RegistrationArgs() {
        this.contactNotices = Codegen.empty();
        this.contactSettings = Codegen.empty();
        this.dnsSettings = Codegen.empty();
        this.domainName = Codegen.empty();
        this.domainNotices = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.managementSettings = Codegen.empty();
        this.project = Codegen.empty();
        this.validateOnly = Codegen.empty();
        this.yearlyPrice = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RegistrationContactNoticesItem>> contactNotices;
        private Output<ContactSettingsArgs> contactSettings;
        private @Nullable Output<DnsSettingsArgs> dnsSettings;
        private Output<String> domainName;
        private @Nullable Output<List<RegistrationDomainNoticesItem>> domainNotices;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<ManagementSettingsArgs> managementSettings;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> validateOnly;
        private Output<MoneyArgs> yearlyPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactNotices = defaults.contactNotices;
    	      this.contactSettings = defaults.contactSettings;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.domainName = defaults.domainName;
    	      this.domainNotices = defaults.domainNotices;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.managementSettings = defaults.managementSettings;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
    	      this.yearlyPrice = defaults.yearlyPrice;
        }

        public Builder contactNotices(@Nullable Output<List<RegistrationContactNoticesItem>> contactNotices) {
            this.contactNotices = contactNotices;
            return this;
        }
        public Builder contactNotices(@Nullable List<RegistrationContactNoticesItem> contactNotices) {
            this.contactNotices = Codegen.ofNullable(contactNotices);
            return this;
        }
        public Builder contactNotices(RegistrationContactNoticesItem... contactNotices) {
            return contactNotices(List.of(contactNotices));
        }
        public Builder contactSettings(Output<ContactSettingsArgs> contactSettings) {
            this.contactSettings = Objects.requireNonNull(contactSettings);
            return this;
        }
        public Builder contactSettings(ContactSettingsArgs contactSettings) {
            this.contactSettings = Output.of(Objects.requireNonNull(contactSettings));
            return this;
        }
        public Builder dnsSettings(@Nullable Output<DnsSettingsArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }
        public Builder dnsSettings(@Nullable DnsSettingsArgs dnsSettings) {
            this.dnsSettings = Codegen.ofNullable(dnsSettings);
            return this;
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder domainNotices(@Nullable Output<List<RegistrationDomainNoticesItem>> domainNotices) {
            this.domainNotices = domainNotices;
            return this;
        }
        public Builder domainNotices(@Nullable List<RegistrationDomainNoticesItem> domainNotices) {
            this.domainNotices = Codegen.ofNullable(domainNotices);
            return this;
        }
        public Builder domainNotices(RegistrationDomainNoticesItem... domainNotices) {
            return domainNotices(List.of(domainNotices));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managementSettings(@Nullable Output<ManagementSettingsArgs> managementSettings) {
            this.managementSettings = managementSettings;
            return this;
        }
        public Builder managementSettings(@Nullable ManagementSettingsArgs managementSettings) {
            this.managementSettings = Codegen.ofNullable(managementSettings);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder validateOnly(@Nullable Output<Boolean> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable Boolean validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }
        public Builder yearlyPrice(Output<MoneyArgs> yearlyPrice) {
            this.yearlyPrice = Objects.requireNonNull(yearlyPrice);
            return this;
        }
        public Builder yearlyPrice(MoneyArgs yearlyPrice) {
            this.yearlyPrice = Output.of(Objects.requireNonNull(yearlyPrice));
            return this;
        }        public RegistrationArgs build() {
            return new RegistrationArgs(contactNotices, contactSettings, dnsSettings, domainName, domainNotices, labels, location, managementSettings, project, validateOnly, yearlyPrice);
        }
    }
}
