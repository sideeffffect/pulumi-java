// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.NotificationPreferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContactDetailsResponse {
    /**
     * Contact name of the person.
     * 
     */
    private final String contactName;
    /**
     * List of Email-ids to be notified about job progress.
     * 
     */
    private final List<String> emailList;
    /**
     * Mobile number of the contact person.
     * 
     */
    private final @Nullable String mobile;
    /**
     * Notification preference for a job stage.
     * 
     */
    private final @Nullable List<NotificationPreferenceResponse> notificationPreference;
    /**
     * Phone number of the contact person.
     * 
     */
    private final String phone;
    /**
     * Phone extension number of the contact person.
     * 
     */
    private final @Nullable String phoneExtension;

    @CustomType.Constructor
    private ContactDetailsResponse(
        @CustomType.Parameter("contactName") String contactName,
        @CustomType.Parameter("emailList") List<String> emailList,
        @CustomType.Parameter("mobile") @Nullable String mobile,
        @CustomType.Parameter("notificationPreference") @Nullable List<NotificationPreferenceResponse> notificationPreference,
        @CustomType.Parameter("phone") String phone,
        @CustomType.Parameter("phoneExtension") @Nullable String phoneExtension) {
        this.contactName = contactName;
        this.emailList = emailList;
        this.mobile = mobile;
        this.notificationPreference = notificationPreference;
        this.phone = phone;
        this.phoneExtension = phoneExtension;
    }

    /**
     * Contact name of the person.
     * 
    */
    public String contactName() {
        return this.contactName;
    }
    /**
     * List of Email-ids to be notified about job progress.
     * 
    */
    public List<String> emailList() {
        return this.emailList;
    }
    /**
     * Mobile number of the contact person.
     * 
    */
    public Optional<String> mobile() {
        return Optional.ofNullable(this.mobile);
    }
    /**
     * Notification preference for a job stage.
     * 
    */
    public List<NotificationPreferenceResponse> notificationPreference() {
        return this.notificationPreference == null ? List.of() : this.notificationPreference;
    }
    /**
     * Phone number of the contact person.
     * 
    */
    public String phone() {
        return this.phone;
    }
    /**
     * Phone extension number of the contact person.
     * 
    */
    public Optional<String> phoneExtension() {
        return Optional.ofNullable(this.phoneExtension);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactName;
        private List<String> emailList;
        private @Nullable String mobile;
        private @Nullable List<NotificationPreferenceResponse> notificationPreference;
        private String phone;
        private @Nullable String phoneExtension;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.emailList = defaults.emailList;
    	      this.mobile = defaults.mobile;
    	      this.notificationPreference = defaults.notificationPreference;
    	      this.phone = defaults.phone;
    	      this.phoneExtension = defaults.phoneExtension;
        }

        public Builder contactName(String contactName) {
            this.contactName = Objects.requireNonNull(contactName);
            return this;
        }
        public Builder emailList(List<String> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }
        public Builder emailList(String... emailList) {
            return emailList(List.of(emailList));
        }
        public Builder mobile(@Nullable String mobile) {
            this.mobile = mobile;
            return this;
        }
        public Builder notificationPreference(@Nullable List<NotificationPreferenceResponse> notificationPreference) {
            this.notificationPreference = notificationPreference;
            return this;
        }
        public Builder notificationPreference(NotificationPreferenceResponse... notificationPreference) {
            return notificationPreference(List.of(notificationPreference));
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public Builder phoneExtension(@Nullable String phoneExtension) {
            this.phoneExtension = phoneExtension;
            return this;
        }        public ContactDetailsResponse build() {
            return new ContactDetailsResponse(contactName, emailList, mobile, notificationPreference, phone, phoneExtension);
        }
    }
}
